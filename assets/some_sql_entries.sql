SELECT * FROM skillseeker.skillseeker.users;
SELECT * FROM skillseeker.skillseeker.specialists;
SELECT * FROM skillseeker.specializations;
SELECT * FROM skillseeker.specialist_specializations;
SELECT * FROM skillseeker.services;
SELECT * FROM skillseeker.bookings;
SELECT * FROM skillseeker.reviews;
SELECT * FROM skillseeker.availability;
SELECT * FROM skillseeker.payments;
SELECT * FROM skillseeker.messages;
SELECT * FROM skillseeker.notifications;
SELECT * FROM skillseeker.verifications;
SELECT * FROM skillseeker.audit_logs;






INSERT INTO skillseeker.users (username, password, email, first_name, last_name, phone_number)
VALUES ('john_doe', 'password123', 'john.doe@example.com', 'John', 'Doe', '555-1234');

INSERT INTO skillseeker.users (username, password, email, first_name, last_name, phone_number)
VALUES ('jane_smith', 'securepass456', 'jane.smith@example.com', 'Jane', 'Smith', '555-5678');

INSERT INTO skillseeker.users (username, password, email, first_name, last_name, phone_number)
VALUES ('alice_jones', 'mypassword789', 'alice.jones@example.com', 'Alice', 'Jones', '555-8765');

INSERT INTO skillseeker.users (username, password, email, first_name, last_name, phone_number)
VALUES ('bob_brown', 'brownie123', 'bob.brown@example.com', 'Bob', 'Brown', '555-4321');

INSERT INTO skillseeker.users (username, password, email, first_name, last_name, phone_number)
VALUES ('charlie_green', 'green12345', 'charlie.green@example.com', 'Charlie', 'Green', '555-9988');


INSERT INTO skillseeker.specialists (user_id, profile_photo, bio, qualification, experience_years, location)
VALUES (1, 'path/to/photo1.jpg', 'Experienced in general medicine.', 'MBBS, MD', 10, 'New York, NY');

INSERT INTO skillseeker.specialists (user_id, profile_photo, bio, qualification, experience_years, location)
VALUES (2, 'path/to/photo2.jpg', 'Specialist in dermatology.', 'MBBS, MD Dermatology', 8, 'Los Angeles, CA');

INSERT INTO skillseeker.specialists (user_id, profile_photo, bio, qualification, experience_years, location)
VALUES (3, 'path/to/photo3.jpg', 'Expert in mental health and therapy.', 'PhD Psychology', 12, 'Chicago, IL');


INSERT INTO skillseeker.specializations (name) VALUES ('General Medicine');
INSERT INTO skillseeker.specializations (name) VALUES ('Dermatology');
INSERT INTO skillseeker.specializations (name) VALUES ('Psychology');

INSERT INTO skillseeker.specialist_specializations (specialist_id, specialization_id)
VALUES (1, 1); -- General Medicine for specialist 1

INSERT INTO skillseeker.specialist_specializations (specialist_id, specialization_id)
VALUES (2, 2); -- Dermatology for specialist 2

INSERT INTO skillseeker.specialist_specializations (specialist_id, specialization_id)
VALUES (3, 3); -- Psychology for specialist 3


INSERT INTO skillseeker.services (specialist_id, service_name, service_description, price)
VALUES (1, 'General Consultation', 'Consultation with a general physician.', 100.00);

INSERT INTO skillseeker.services (specialist_id, service_name, service_description, price)
VALUES (2, 'Skin Check', 'Dermatological examination.', 150.00);

INSERT INTO skillseeker.services (specialist_id, service_name, service_description, price)
VALUES (3, 'Therapy Session', 'One-hour therapy session.', 200.00);


INSERT INTO skillseeker.bookings (user_id, specialist_id, service_id, appointment_date, appointment_time, status)
VALUES (1, 1, 1, '2024-08-10', '10:00:00', 'Confirmed');

INSERT INTO skillseeker.bookings (user_id, specialist_id, service_id, appointment_date, appointment_time, status)
VALUES (2, 2, 2, '2024-08-11', '14:00:00', 'Confirmed');

INSERT INTO skillseeker.bookings (user_id, specialist_id, service_id, appointment_date, appointment_time, status)
VALUES (3, 3, 3, '2024-08-12', '16:00:00', 'Pending');



INSERT INTO skillseeker.reviews (booking_id, rating, review_text)
VALUES (1, 5, 'Excellent service and very professional.');

INSERT INTO skillseeker.reviews (booking_id, rating, review_text)
VALUES (2, 4, 'Good consultation, but the waiting time was a bit long.');

INSERT INTO skillseeker.reviews (booking_id, rating, review_text)
VALUES (3, 3, 'Average experience, room for improvement.');



INSERT INTO skillseeker.availability (specialist_id, available_date, start_time, end_time)
VALUES (1, '2024-08-10', '09:00:00', '17:00:00');

INSERT INTO skillseeker.availability (specialist_id, available_date, start_time, end_time)
VALUES (2, '2024-08-11', '10:00:00', '16:00:00');

INSERT INTO skillseeker.availability (specialist_id, available_date, start_time, end_time)
VALUES (3, '2024-08-12', '12:00:00', '18:00:00');


INSERT INTO skillseeker.payments (booking_id, amount, payment_date, payment_method, status)
VALUES (1, 100.00, '2024-08-10 10:00:00', 'Credit Card', 'Completed');

INSERT INTO skillseeker.payments (booking_id, amount, payment_date, payment_method, status)
VALUES (2, 150.00, '2024-08-11 14:00:00', 'PayPal', 'Completed');

INSERT INTO skillseeker.payments (booking_id, amount, payment_date, payment_method, status)
VALUES (3, 200.00, '2024-08-12 16:00:00', 'Cash', 'Pending');



INSERT INTO skillseeker.messages (sender_id, receiver_id, booking_id, message_text)
VALUES (1, 2, 1, 'Looking forward to my consultation.');

INSERT INTO skillseeker.messages (sender_id, receiver_id, booking_id, message_text)
VALUES (2, 3, 2, 'Can we reschedule?');

INSERT INTO skillseeker.messages (sender_id, receiver_id, booking_id, message_text)
VALUES (3, 1, 3, 'Can I get more information about the service?');

INSERT INTO skillseeker.notifications (user_id, specialist_id, message)
VALUES (1, NULL, 'Your booking has been confirmed.');

INSERT INTO skillseeker.notifications (user_id, specialist_id, message)
VALUES (NULL, 2, 'You have a new booking request.');

INSERT INTO skillseeker.notifications (user_id, specialist_id, message)
VALUES (2, NULL, 'Payment for your consultation is pending.');




INSERT INTO skillseeker.verifications (specialist_id, document_type, document_url, verified)
VALUES (1, 'Medical License', 'path/to/license1.pdf', TRUE);

INSERT INTO skillseeker.verifications (specialist_id, document_type, document_url, verified)
VALUES (2, 'Medical License', 'path/to/license2.pdf', FALSE);

INSERT INTO skillseeker.verifications (specialist_id, document_type, document_url, verified)
VALUES (3, 'PhD Certificate', 'path/to/certificate3.pdf', TRUE);


INSERT INTO skillseeker.audit_logs (user_id, action)
VALUES (1, 'Logged in');

INSERT INTO skillseeker.audit_logs (user_id, action)
VALUES (2, 'Updated profile');

INSERT INTO skillseeker.audit_logs (user_id, action)
VALUES (3, 'Booked a service');
commit;
