CREATE TABLE IF NOT EXIST auto_post (
    id SERIAL PRIMARY KEY,
    description TEXT,
    created Date,
    auto_user_id REFERENCES auto_user(id)
);