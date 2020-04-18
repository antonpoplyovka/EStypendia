CREATE TABLE "student" (
	"id" serial NOT NULL,
	"name" varchar(50) NOT NULL,
	"surname" varchar(50) NOT NULL,
	"father_name" varchar(50) NOT NULL,
	"place_of_birth" varchar(50) NOT NULL,
	"country_of_birth" varchar(50) NOT NULL,
	"nationality" varchar(50) NOT NULL,
	"nationality_of_birth" varchar(50) NOT NULL,
	"address_of_residence" integer ,
	"actual_address" integer ,
	"address_type" integer ,
	"type_of_student" integer ,
	CONSTRAINT "student_pk" PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "address" (
	"id" serial NOT NULL,
	"student_id" integer NOT NULL,
	"actual_address" BOOLEAN NOT NULL,
	"code" varchar(10) NOT NULL,
	"street" varchar(50) NOT NULL,
	"district" varchar(50) NOT NULL,
	"voivodeship" varchar(50) NOT NULL,
	"city" varchar(50) NOT NULL,
	"country" varchar(50) NOT NULL,
	"phone" varchar(50) NOT NULL,
	"house_number" varchar(50) NOT NULL,
	"flat_number" varchar(50),
	CONSTRAINT "address_pk" PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "payments_log" (
	"id" serial NOT NULL,
	"student_id" integer NOT NULL,
	"payout_amount" integer NOT NULL,
	"payment_date" TIMESTAMP NOT NULL,
	CONSTRAINT "paymentsLog_pk" PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "type_of_housing" (
	"id" serial NOT NULL,
	"cost" integer NOT NULL,
	"description" varchar(255) NOT NULL,
	CONSTRAINT "typeOfHousing_pk" PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "type_of_student" (
	"id" serial NOT NULL,
	"monthly_payment" integer NOT NULL,
	"description" varchar(255) NOT NULL,
	CONSTRAINT "typeOfStudent_pk" PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);


