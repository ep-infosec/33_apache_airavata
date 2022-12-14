use app_catalog;

ALTER TABLE APPLICATION_INPUT ADD COLUMN IF NOT EXISTS OVERRIDE_FILENAME VARCHAR(255);
-- AIRAVATA-3126
CREATE TABLE IF NOT EXISTS COMPUTE_RESOURCE_RESERVATION -- ComputeResourceReservationEntity
    (RESERVATION_ID VARCHAR(255) NOT NULL, END_TIME TIMESTAMP NOT NULL, RESERVATION_NAME VARCHAR(255) NOT NULL, START_TIME TIMESTAMP NOT NULL, RESOURCE_ID VARCHAR(255) NOT NULL, GROUP_RESOURCE_PROFILE_ID VARCHAR(255) NOT NULL, PRIMARY KEY (RESERVATION_ID)
)ENGINE=InnoDB DEFAULT CHARSET=latin1;
CREATE TABLE IF NOT EXISTS COMPUTE_RESOURCE_RESERVATION_QUEUE (RESERVATION_ID VARCHAR(255), QUEUE_NAME VARCHAR(255) NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=latin1;
CREATE INDEX IF NOT EXISTS I_CMPTN_Q_RESERVATION_ID ON COMPUTE_RESOURCE_RESERVATION_QUEUE (RESERVATION_ID);
ALTER TABLE COMPUTE_RESOURCE_RESERVATION ADD CONSTRAINT FK_COMPUTE_RESOURCE_RESERVATION FOREIGN KEY IF NOT EXISTS (RESOURCE_ID, GROUP_RESOURCE_PROFILE_ID) REFERENCES GROUP_COMPUTE_RESOURCE_PREFERENCE (RESOURCE_ID, GROUP_RESOURCE_PROFILE_ID) ON DELETE CASCADE;

-- AIRAVATA-3327: Remove deprecated reservation fields
--alter table GROUP_COMPUTE_RESOURCE_PREFERENCE drop column IF EXISTS RESERVATION;
--alter table GROUP_COMPUTE_RESOURCE_PREFERENCE drop column IF EXISTS RESERVATION_START_TIME;
--alter table GROUP_COMPUTE_RESOURCE_PREFERENCE drop column IF EXISTS RESERVATION_END_TIME;

-- AIRAVATA-3369: Convert USER_FRIENDLY_DESC from VARCHAR to TEXT (CLOB)
alter table APPLICATION_INPUT modify column USER_FRIENDLY_DESC TEXT;
