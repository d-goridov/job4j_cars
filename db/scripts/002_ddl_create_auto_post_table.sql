CREATE TABLE IF NOT EXISTS auto_post (
    id SERIAL PRIMARY KEY,
    description TEXT,
    created Date,
    auto_user_id INT REFERENCES auto_user(id)
);