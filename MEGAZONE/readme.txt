# SQL Server Table Query
CREATE TABLE data (
    num INT IDENTITY(1,1) PRIMARY KEY,
    webserver_name VARCHAR(50),
    contents TEXT,
    date DATETIME DEFAULT GETDATE(),
    rw VARCHAR(10) NULL
);