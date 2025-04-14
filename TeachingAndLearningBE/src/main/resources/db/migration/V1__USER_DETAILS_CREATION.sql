CREATE TABLE
    student_sign_up
(
    id                 SERIAL PRIMARY KEY,
    name               VARCHAR(255) NOT NULL,
    age                BIGINT       NOT NULL,
    email              VARCHAR(255) NOT NULL,
    whatsapp_number    VARCHAR(255) NOT NULL,
    language_medium    VARCHAR(255) NOT NULL,
    education_level    VARCHAR(255) NOT NULL,
    al_stream          VARCHAR(255),
    ol_first_category  VARCHAR(255),
    ol_second_category VARCHAR(255),
    ol_third_category  VARCHAR(255),
    password           varchar(255)
);

CREATE TABLE
    teacher_sign_up
(
    id                        SERIAL PRIMARY KEY,
    name                      VARCHAR(255) NOT NULL,
    age                       INT          NOT NULL,
    nic_number                VARCHAR(255) NOT NULL,
    whatsapp_number           VARCHAR(255) NOT NULL,
    teacher_type              VARCHAR(255) NOT NULL,
    language_medium           VARCHAR(255) NOT NULL,
    education_level           VARCHAR(255) NOT NULL,
    al_subject_stream         VARCHAR(255),
    physical_science_subjects VARCHAR(255),
    bio_science_subjects      VARCHAR(255),
    commerce_subjects         VARCHAR(255),
    art_subjects              VARCHAR(255),
    technology_subjects       VARCHAR(255),
    ol_subjects               VARCHAR(255),
    password                  VARCHAR(255),
    approval_status            VARCHAR(12)
);

CREATE SEQUENCE teacher_sign_up_seq INCREMENT BY 50;

CREATE SEQUENCE student_sign_up_seq INCREMENT BY 50;