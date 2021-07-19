;             
CREATE USER IF NOT EXISTS "SA" SALT '79576dc3f3cd207b' HASH '042816ba50b4cac02c382c17b6037c729564f80e100e293d9afbc6a8d8c871e8' ADMIN;         
CREATE SEQUENCE "PUBLIC"."SYSTEM_SEQUENCE_3C57875F_ABB4_4245_BE31_C3703980EF29" START WITH 9 BELONGS_TO_TABLE;
CREATE MEMORY TABLE "PUBLIC"."STUDENT"(
    "SID" INTEGER DEFAULT NEXT VALUE FOR "PUBLIC"."SYSTEM_SEQUENCE_3C57875F_ABB4_4245_BE31_C3703980EF29" NOT NULL NULL_TO_DEFAULT SEQUENCE "PUBLIC"."SYSTEM_SEQUENCE_3C57875F_ABB4_4245_BE31_C3703980EF29",
    "SCITY" VARCHAR(255),
    "SNAME" VARCHAR(255)
); 
ALTER TABLE "PUBLIC"."STUDENT" ADD CONSTRAINT "PUBLIC"."CONSTRAINT_B" PRIMARY KEY("SID");     
-- 8 +/- SELECT COUNT(*) FROM PUBLIC.STUDENT; 
INSERT INTO "PUBLIC"."STUDENT" VALUES
(1, 'RABAT', 'ISMAIL'),
(2, 'CASA', 'ISMAIL23'),
(3, 'CASA', 'ISMAIL24'),
(4, 'CASA', 'ISMAIL25'),
(5, 'CASA', 'ISMAIL26'),
(6, 'CASA', 'ISMAIL27'),
(7, 'CASA', 'ISMAIL28'),
(8, 'CASA', 'ISMAIL29');          