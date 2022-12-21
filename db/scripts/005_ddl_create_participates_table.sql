CREATE TABLE IF NOT EXISTS participates(
    id SERIAL PRIMARY KEY,
    user_id int REFERENCES auto_user(id),
    post_id int REFERENCES auto_post(id)
);