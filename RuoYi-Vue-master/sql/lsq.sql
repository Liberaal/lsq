CREATE TABLE user (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    role ENUM('Admin', 'Expert', 'Teacher') NOT NULL
);

CREATE TABLE admin (
    id INT PRIMARY KEY,
    FOREIGN KEY (id) REFERENCES user(id)
);

CREATE TABLE expert (
    id INT PRIMARY KEY,
    FOREIGN KEY (id) REFERENCES user(id)
);

CREATE TABLE teacher (
    id INT PRIMARY KEY,
    FOREIGN KEY (id) REFERENCES user(id)
);

CREATE TABLE competition_work (
    work_id INT PRIMARY KEY AUTO_INCREMENT,
    work_title VARCHAR(255) NOT NULL,
    work_content LONGBLOB,
    uploaded_by INT,
    score DECIMAL(5, 2),
    FOREIGN KEY (uploaded_by) REFERENCES teacher(id)
);

CREATE TABLE evaluation_criteria (
    criteria_id INT PRIMARY KEY AUTO_INCREMENT,
    criteria_description TEXT,
    scoring_details TEXT
);

CREATE TABLE scoring_record (
    scoring_id INT PRIMARY KEY AUTO_INCREMENT,
    scoring_expert INT,
    work_id INT,
    score DECIMAL(5, 2),
    scoring_time DATETIME,
    FOREIGN KEY (scoring_expert) REFERENCES expert(id),
    FOREIGN KEY (work_id) REFERENCES competition_work(work_id)
);
