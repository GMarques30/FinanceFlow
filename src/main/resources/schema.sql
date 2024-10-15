DROP SCHEMA IF EXISTS financeflow CASCADE;

CREATE SCHEMA financeflow;

CREATE TABLE financeflow.bills (
    bill_id UUID NOT NULL PRIMARY KEY,
    amount DECIMAL(10, 2) NOT NULL,
    description VARCHAR(255),
    category VARCHAR(255),
    created_at VARCHAR(255) NOT NULL,
    occurred_at VARCHAR(255) NOT NULL
);