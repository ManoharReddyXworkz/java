CREATE TABLE `resort`.`resort_info` (
  `id` INT NOT NULL,
  `rname` VARCHAR(45) NULL,
  `location` VARCHAR(45) NULL,
  `checkintime` TIME NULL,
  `checkouttime` TIME NULL,
  `createBy` VARCHAR(45) NULL,
  `createDate` VARCHAR(45) NULL,
  `updateDate` VARCHAR(45) NULL,
  `owner` VARCHAR(45) NULL,
  `priceperday` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));