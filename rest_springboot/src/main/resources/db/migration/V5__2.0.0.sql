ALTER TABLE person
    ADD enabled BOOLEAN;

UPDATE person
    SET enabled = true;

ALTER TABLE person
    ALTER COLUMN enabled SET NOT NULL;