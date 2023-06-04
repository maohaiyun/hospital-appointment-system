### After launching the project, run the following sql to insert roles:
```insert into hospital_appointment.roles (name) values ('ROLE_GUEST');  // id = 1
insert into hospital_appointment.roles (name) values ('ROLE_GUEST'); // id = 1
insert into hospital_appointment.roles (name) values ('ROLE_DOCTOR');  // id = 2
insert into hospital_appointment.roles (name) values ('ROLE_MANAGER');  // id = 3
```
### Whenever a new user gets registered, run the following sql to assign the role:
```// e.g. assign the manager/nurse role to the user whose user_id = 1
insert into hospital_appointment.users_roles (user_id, role_id) values (1,3);
```