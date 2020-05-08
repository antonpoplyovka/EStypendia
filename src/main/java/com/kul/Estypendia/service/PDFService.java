package com.kul.Estypendia.service;

import be.quodlibet.boxable.*;
import be.quodlibet.boxable.line.LineStyle;
import com.kul.Estypendia.controller.DTO.AdminReportDTORecord;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.io.IOException;
import java.util.List;
import java.util.Random;

@Service
public class PDFService {
    private ReportService reportService;
    private Random random = new Random();

    @Autowired
    public PDFService(ReportService reportService) {
        this.reportService = reportService;
    }

    public void s() throws IOException {
        PDDocument pdDocument = new PDDocument();
        PDPage page = new PDPage();
        pdDocument.addPage(page);
        PDPageContentStream contentStream = new PDPageContentStream(pdDocument, page);
        contentStream.setFont(PDType1Font.COURIER, 12);
        contentStream.beginText();
        contentStream.showText("Hello World");
        contentStream.endText();
        contentStream.close();
        pdDocument.save(generateFileName());
        pdDocument.close();
    }

    public void createPDFForAdminReport() throws IOException {
        List<AdminReportDTORecord> adminReport = reportService.adminReport();

        String outputFileName = generateFileName();

        PDFont fontBold = PDType1Font.HELVETICA_BOLD;

        PDDocument document = new PDDocument();
        PDPage page = new PDPage(PDRectangle.A4);
        PDRectangle rect = page.getMediaBox();
        document.addPage(page);

        PDPageContentStream cos = new PDPageContentStream(document, page);

        float margin = 50;
        float yStartNewPage = page.getMediaBox().getHeight() - (2 * margin);
        float tableWidth = page.getMediaBox().getWidth() - (2 * margin);

        boolean drawContent = true;
        float yStart = yStartNewPage;
        float bottomMargin = 70;
        float yPosition = 800;

        BaseTable table = new BaseTable(yPosition, yStartNewPage,
                bottomMargin, tableWidth, margin, document, page, true, drawContent);

        Row<PDPage> headerRow = table.createRow(50);
        Cell<PDPage> cell = headerRow.createCell(100, "Raport stypendiów");
        cell.setFont(fontBold);
        cell.setFontSize(20);
        cell.setValign(VerticalAlignment.MIDDLE);
        cell.setTopBorderStyle(new LineStyle(Color.BLACK, 10));
        table.addHeaderRow(headerRow);
        for (AdminReportDTORecord record :adminReport) {
            Row<PDPage> row = table.createRow(20);
            cell = row.createCell(30, record.getName());
            cell = row.createCell(40, record.getSurname());
            cell = row.createCell(30, record.getMonthlyPayment().toString());
        }

        table.draw();

        float tableHeight = table.getHeaderAndDataHeight();
        System.out.println("tableHeight = "+tableHeight);

        // close the content stream
        cos.close();

        // Save the results and ensure that the document is properly closed:
        document.save(outputFileName);
        document.close();
    }
    private String generateFileName(){
        return new String("adminReport"+random.nextInt(100000));
    }
}
