INSERT INTO `Person` (`id`,`name`,`email`,`password`,`activated`) VALUES (1,"ADMIN","admin@admin","admin",true),(2,"Logan Dawson","user@user","user",false);
INSERT INTO `Role` (`name`)VALUES("ROLE_ADMIN"),("ROLE_USER");
INSERT INTO `person_role`(`person_id`,`role_id`)VALUES(1,1),(2,2);