--CATEGORIES
INSERT INTO `sg_congelados_db`.`categories` (`category_id`, `created_at`, `deleted`, `name`, `updated_at`) SELECT 1, now(), 0, 'frutas', null
WHERE NOT EXISTS (SELECT * FROM `categories` WHERE category_id = 1);
INSERT INTO `sg_congelados_db`.`categories` (`category_id`, `created_at`, `deleted`, `name`, `updated_at`) SELECT 2, now(), 0, 'verduras', null
WHERE NOT EXISTS (SELECT * FROM `categories` WHERE category_id = 2);
INSERT INTO `sg_congelados_db`.`categories` (`category_id`, `created_at`, `deleted`, `name`, `updated_at`) SELECT 3, now(), 0, 'mix', null
WHERE NOT EXISTS (SELECT * FROM `categories` WHERE category_id = 3);

--PRODUCTS
INSERT INTO `sg_congelados_db`.`products` (`product_id`, `created_at`, `deleted`, `description`, `image_url`, `name`, `stock`, `unit_price`, `updated_at`, `category_id`)
SELECT 1, now(), 0, 'Champiñones enteros por 1Kg', 'img', 'Champiñones', 50, 1000.00, null, 2
WHERE NOT EXISTS (SELECT * FROM `products` WHERE product_id = 1);
INSERT INTO `sg_congelados_db`.`products` (`product_id`, `created_at`, `deleted`, `description`, `image_url`, `name`, `stock`, `unit_price`, `updated_at`, `category_id`)
SELECT 2, now(), 0, 'Frutos rojos (Frutilla, Arándanos, Moras) por 1Kg', 'img', 'Mix de Frutos Rojos', 42, 950.00, null, 3
WHERE NOT EXISTS (SELECT * FROM `products` WHERE product_id = 2);
INSERT INTO `sg_congelados_db`.`products` (`product_id`, `created_at`, `deleted`, `description`, `image_url`, `name`, `stock`, `unit_price`, `updated_at`, `category_id`)
SELECT 3, now(), 0, 'Cebolla en cubo por 1Kg', 'img', 'Cebollas', 56, 670.00, null, 2
WHERE NOT EXISTS (SELECT * FROM `products` WHERE product_id = 3);
INSERT INTO `sg_congelados_db`.`products` (`product_id`, `created_at`, `deleted`, `description`, `image_url`, `name`, `stock`, `unit_price`, `updated_at`, `category_id`)
SELECT 4, now(), 0, 'Pimientos en cubo por 1Kg', 'img', 'Pimientos', 39, 720.00, null, 2
WHERE NOT EXISTS (SELECT * FROM `products` WHERE product_id = 4);
INSERT INTO `sg_congelados_db`.`products` (`product_id`, `created_at`, `deleted`, `description`, `image_url`, `name`, `stock`, `unit_price`, `updated_at`, `category_id`)
SELECT 5, now(), 0, 'Arándanos enteros por 1Kg', 'img', 'Arándanos', 57, 1020.00, null, 1
WHERE NOT EXISTS (SELECT * FROM `products` WHERE product_id = 5);
INSERT INTO `sg_congelados_db`.`products` (`product_id`, `created_at`, `deleted`, `description`, `image_url`, `name`, `stock`, `unit_price`, `updated_at`, `category_id`)
SELECT 6, now(), 0, 'Frutillas enteras por 1Kg', 'img', 'Frutillas', 50, 1060.00, null, 1
WHERE NOT EXISTS (SELECT * FROM `products` WHERE product_id = 6);
INSERT INTO `sg_congelados_db`.`products` (`product_id`, `created_at`, `deleted`, `description`, `image_url`, `name`, `stock`, `unit_price`, `updated_at`, `category_id`)
SELECT 7, now(), 0, 'Mix de espinaca por 1Kg', 'img', 'Mix de espinaca', 30, 740.00, null, 3
WHERE NOT EXISTS (SELECT * FROM `products` WHERE product_id = 7);
INSERT INTO `sg_congelados_db`.`products` (`product_id`, `created_at`, `deleted`, `description`, `image_url`, `name`, `stock`, `unit_price`, `updated_at`, `category_id`)
SELECT 8, now(), 0, 'Mix salsa de tomate por 1Kg', 'img', 'Mix salsa de tomate', 43, 820.00, null, 3
WHERE NOT EXISTS (SELECT * FROM `products` WHERE product_id = 8);
INSERT INTO `sg_congelados_db`.`products` (`product_id`, `created_at`, `deleted`, `description`, `image_url`, `name`, `stock`, `unit_price`, `updated_at`, `category_id`)
SELECT 9, now(), 0, 'Papas en cubos por 1Kg', 'img', 'Papas', 43, 640.00, null, 2
WHERE NOT EXISTS (SELECT * FROM `products` WHERE product_id = 9);
INSERT INTO `sg_congelados_db`.`products` (`product_id`, `created_at`, `deleted`, `description`, `image_url`, `name`, `stock`, `unit_price`, `updated_at`, `category_id`)
SELECT 10, now(), 0, 'Calabaza en cubos por 1Kg', 'img', 'Calabaza', 45, 735.00, null, 2
WHERE NOT EXISTS (SELECT * FROM `products` WHERE product_id = 10);

----USERS
--INSERT INTO `sg_congelados_db`.`users` (`user_id`, `created_at`, `date_of_birth`, `deleted`, `email`, `is_verify`, `last_name`, `name`, `password`,  `updated_at`) SELECT 1, now(), '1990-01-12', 0, 'carlosR@example.com', true, 'Ramirez', 'Carlos', 'a12345', null
--WHERE NOT EXISTS (SELECT * FROM `users` WHERE user_id = 1);
--INSERT INTO `sg_congelados_db`.`users` (`user_id`, `created_at`, `date_of_birth`, `deleted`, `email`, `is_verify`, `last_name`, `name`, `password`, `updated_at`) SELECT 2, now(), '1992-05-01', 0, 'manuelF@example.com', true, 'Fernandez', 'Manuel', 'b12345', null
--WHERE NOT EXISTS (SELECT * FROM `users` WHERE user_id = 2);
--INSERT INTO `sg_congelados_db`.`users` (`user_id`, `created_at`, `date_of_birth`, `deleted`, `email`, `is_verify`, `last_name`, `name`, `password`, `updated_at`) SELECT 3, now(), '1989-08-19', 0, 'rominaG@example.com', true, 'Garay', 'Romina', 'c12345', null
--WHERE NOT EXISTS (SELECT * FROM `users` WHERE user_id = 3);
--INSERT INTO `sg_congelados_db`.`users` (`user_id`, `created_at`, `date_of_birth`, `deleted`, `email`, `is_verify`, `last_name`, `name`, `password`, `updated_at`) SELECT 4, now(), '1991-03-13', 0, 'fernandoP@example.com', true, 'Peralta', 'Fernando', 'd12345', null
--WHERE NOT EXISTS (SELECT * FROM `users` WHERE user_id = 4);
--INSERT INTO `sg_congelados_db`.`users` (`user_id`, `created_at`, `date_of_birth`, `deleted`, `email`, `is_verify`, `last_name`, `name`, `password`, `updated_at`) SELECT 5, now(), '1993-11-26', 0, 'sofiaG@example.com', true, 'Gutierrez', 'Sofia', 'e12345', null
--WHERE NOT EXISTS (SELECT * FROM `users` WHERE user_id = 5);

----ADDRESSES
--INSERT INTO `sg_congelados_db`.`addresses` (`address_id`, `apartment`, `city`, `created_at`, `deleted`, `postcode`, `province`, `street`, `street_number`, `updated_at`, `user_id`)
--SELECT 1, '2A', 'Rosario', now(), 0, '2000', 'Santa Fe', 'Urquiza', '2546', null, 1
--WHERE NOT EXISTS (SELECT * FROM `addresses` WHERE address_id = 1);
--INSERT INTO `sg_congelados_db`.`addresses` (`address_id`, `apartment`, `city`, `created_at`, `deleted`, `postcode`, `province`, `street`, `street_number`, `updated_at`, `user_id`)
--SELECT 2, '5B', 'Paraná', now(), 0, '3100', 'Entre Rios', 'Sarmiento', '420', null, 2
--WHERE NOT EXISTS (SELECT * FROM `addresses` WHERE address_id = 2);
--INSERT INTO `sg_congelados_db`.`addresses` (`address_id`, `apartment`, `city`, `created_at`, `deleted`, `postcode`, `province`, `street`, `street_number`, `updated_at`, `user_id`)
--SELECT 3, 'Casa', 'Córdoba', now(), 0, '5000', 'Córdoba', 'San Martin', '100', null, 3
--WHERE NOT EXISTS (SELECT * FROM `addresses` WHERE address_id = 3);
--INSERT INTO `sg_congelados_db`.`addresses` (`address_id`, `apartment`, `city`, `created_at`, `deleted`, `postcode`, `province`, `street`, `street_number`, `updated_at`, `user_id`)
--SELECT 4, '1D', 'Santa Fe', now(), 0, '3000', 'Santa Fe', 'Belgrano', '1234', null, 4
--WHERE NOT EXISTS (SELECT * FROM `addresses` WHERE address_id = 4);
--INSERT INTO `sg_congelados_db`.`addresses` (`address_id`, `apartment`, `city`, `created_at`, `deleted`, `postcode`, `province`, `street`, `street_number`, `updated_at`, `user_id`)
--SELECT 5, 'Casa', 'Santa Fe', now(), 0, '3000', 'Santa Fe', 'Corrientes', '320', null, 5
--WHERE NOT EXISTS (SELECT * FROM `addresses` WHERE address_id = 5);
--
----ORDERS
--INSERT INTO `sg_congelados_db`.`orders` (`order_id`, `created_at`, `deleted`, `updated_at`, `address_id`, `user_id`) SELECT 1, now(), 0, null, 1, 1
--WHERE NOT EXISTS (SELECT * FROM `orders` WHERE order_id = 1);
--INSERT INTO `sg_congelados_db`.`orders` (`order_id`, `created_at`, `deleted`, `updated_at`, `address_id`, `user_id`) SELECT 2, now(), 0, null, 1, 1
--WHERE NOT EXISTS (SELECT * FROM `orders` WHERE order_id = 2);
--INSERT INTO `sg_congelados_db`.`orders` (`order_id`, `created_at`, `deleted`, `updated_at`, `address_id`, `user_id`) SELECT 3, now(), 0, null, 2, 2
--WHERE NOT EXISTS (SELECT * FROM `orders` WHERE order_id = 3);
--INSERT INTO `sg_congelados_db`.`orders` (`order_id`, `created_at`, `deleted`, `updated_at`, `address_id`, `user_id`) SELECT 4, now(), 0, null, 2, 2
--WHERE NOT EXISTS (SELECT * FROM `orders` WHERE order_id = 4);
--INSERT INTO `sg_congelados_db`.`orders` (`order_id`, `created_at`, `deleted`, `updated_at`, `address_id`, `user_id`) SELECT 5, now(), 0, null, 3, 3
--WHERE NOT EXISTS (SELECT * FROM `orders` WHERE order_id = 5);
--INSERT INTO `sg_congelados_db`.`orders` (`order_id`, `created_at`, `deleted`, `updated_at`, `address_id`, `user_id`) SELECT 6, now(), 0, null, 3, 3
--WHERE NOT EXISTS (SELECT * FROM `orders` WHERE order_id = 6);
--INSERT INTO `sg_congelados_db`.`orders` (`order_id`, `created_at`, `deleted`, `updated_at`, `address_id`, `user_id`) SELECT 7, now(), 0, null, 4, 4
--WHERE NOT EXISTS (SELECT * FROM `orders` WHERE order_id = 7);
--INSERT INTO `sg_congelados_db`.`orders` (`order_id`, `created_at`, `deleted`, `updated_at`, `address_id`, `user_id`) SELECT 8, now(), 0, null, 4, 4
--WHERE NOT EXISTS (SELECT * FROM `orders` WHERE order_id = 8);
--INSERT INTO `sg_congelados_db`.`orders` (`order_id`, `created_at`, `deleted`, `updated_at`, `address_id`, `user_id`) SELECT 9, now(), 0, null, 5, 5
--WHERE NOT EXISTS (SELECT * FROM `orders` WHERE order_id = 9);
--INSERT INTO `sg_congelados_db`.`orders` (`order_id`, `created_at`, `deleted`, `updated_at`, `address_id`, `user_id`) SELECT 10, now(), 0, null, 5, 5
--WHERE NOT EXISTS (SELECT * FROM `orders` WHERE order_id = 10);
--
--
----ORDER-DETAILS
--INSERT INTO `sg_congelados_db`.`order_details` (`order_detail_id`, `created_at`, `deleted`, `price`, `quantity`, `updated_at`, `order_id`, `product_id`) SELECT 1, now(), 0, 2000.00, 2, null, 1, 1
--WHERE NOT EXISTS (SELECT * FROM `order_details` WHERE order_detail_id = 1);
--INSERT INTO `sg_congelados_db`.`order_details` (`order_detail_id`, `created_at`, `deleted`, `price`, `quantity`, `updated_at`, `order_id`, `product_id`) SELECT 2, now(), 0, 2880.00, 3, null, 1, 4
--WHERE NOT EXISTS (SELECT * FROM `order_details` WHERE order_detail_id = 2);
--INSERT INTO `sg_congelados_db`.`order_details` (`order_detail_id`, `created_at`, `deleted`, `price`, `quantity`, `updated_at`, `order_id`, `product_id`) SELECT 3, now(), 0, 820.00, 1, null, 1, 8
--WHERE NOT EXISTS (SELECT * FROM `order_details` WHERE order_detail_id = 3);
--
--INSERT INTO `sg_congelados_db`.`order_details` (`order_detail_id`, `created_at`, `deleted`, `price`, `quantity`, `updated_at`, `order_id`, `product_id`) SELECT 4, now(), 0, 1480.00, 2, null, 1, 7
--WHERE NOT EXISTS (SELECT * FROM `order_details` WHERE order_detail_id = 4);
--INSERT INTO `sg_congelados_db`.`order_details` (`order_detail_id`, `created_at`, `deleted`, `price`, `quantity`, `updated_at`, `order_id`, `product_id`) SELECT 5, now(), 0, 2205.00, 3, null, 1, 10
--WHERE NOT EXISTS (SELECT * FROM `order_details` WHERE order_detail_id = 5);
--
--INSERT INTO `sg_congelados_db`.`order_details` (`order_detail_id`, `created_at`, `deleted`, `price`, `quantity`, `updated_at`, `order_id`, `product_id`) SELECT 6, now(), 0, 2000.00, 2, null, 1, 1
--WHERE NOT EXISTS (SELECT * FROM `order_details` WHERE order_detail_id = 6);
--INSERT INTO `sg_congelados_db`.`order_details` (`order_detail_id`, `created_at`, `deleted`, `price`, `quantity`, `updated_at`, `order_id`, `product_id`) SELECT 7, now(), 0, 3060.00, 3, null, 1, 5
--WHERE NOT EXISTS (SELECT * FROM `order_details` WHERE order_detail_id = 7);
--
--INSERT INTO `sg_congelados_db`.`order_details` (`order_detail_id`, `created_at`, `deleted`, `price`, `quantity`, `updated_at`, `order_id`, `product_id`) SELECT 8, now(), 0, 1900.00, 2, null, 1, 2
--WHERE NOT EXISTS (SELECT * FROM `order_details` WHERE order_detail_id = 8);
--INSERT INTO `sg_congelados_db`.`order_details` (`order_detail_id`, `created_at`, `deleted`, `price`, `quantity`, `updated_at`, `order_id`, `product_id`) SELECT 9, now(), 0, 1920.00, 3, null, 1, 9
--WHERE NOT EXISTS (SELECT * FROM `order_details` WHERE order_detail_id = 9);
--
--INSERT INTO `sg_congelados_db`.`order_details` (`order_detail_id`, `created_at`, `deleted`, `price`, `quantity`, `updated_at`, `order_id`, `product_id`) SELECT 10, now(), 0, 2120.00, 2, null, 1, 6
--WHERE NOT EXISTS (SELECT * FROM `order_details` WHERE order_detail_id = 10);
--INSERT INTO `sg_congelados_db`.`order_details` (`order_detail_id`, `created_at`, `deleted`, `price`, `quantity`, `updated_at`, `order_id`, `product_id`) SELECT 11, now(), 0, 2220.00, 3, null, 1, 7
--WHERE NOT EXISTS (SELECT * FROM `order_details` WHERE order_detail_id = 11);
--
--INSERT INTO `sg_congelados_db`.`order_details` (`order_detail_id`, `created_at`, `deleted`, `price`, `quantity`, `updated_at`, `order_id`, `product_id`) SELECT 12, now(), 0, 1340.00, 2, null, 1, 3
--WHERE NOT EXISTS (SELECT * FROM `order_details` WHERE order_detail_id = 12);
--INSERT INTO `sg_congelados_db`.`order_details` (`order_detail_id`, `created_at`, `deleted`, `price`, `quantity`, `updated_at`, `order_id`, `product_id`) SELECT 13, now(), 0, 2160.00, 3, null, 1, 4
--WHERE NOT EXISTS (SELECT * FROM `order_details` WHERE order_detail_id = 13);
--
--INSERT INTO `sg_congelados_db`.`order_details` (`order_detail_id`, `created_at`, `deleted`, `price`, `quantity`, `updated_at`, `order_id`, `product_id`) SELECT 14, now(), 0, 2000.00, 2, null, 1, 1
--WHERE NOT EXISTS (SELECT * FROM `order_details` WHERE order_detail_id = 14);
--INSERT INTO `sg_congelados_db`.`order_details` (`order_detail_id`, `created_at`, `deleted`, `price`, `quantity`, `updated_at`, `order_id`, `product_id`) SELECT 15, now(), 0, 2850.00, 3, null, 1, 2
--WHERE NOT EXISTS (SELECT * FROM `order_details` WHERE order_detail_id = 15);
--
--INSERT INTO `sg_congelados_db`.`order_details` (`order_detail_id`, `created_at`, `deleted`, `price`, `quantity`, `updated_at`, `order_id`, `product_id`) SELECT 16, now(), 0, 1440.00, 2, null, 1, 4
--WHERE NOT EXISTS (SELECT * FROM `order_details` WHERE order_detail_id = 16);
--INSERT INTO `sg_congelados_db`.`order_details` (`order_detail_id`, `created_at`, `deleted`, `price`, `quantity`, `updated_at`, `order_id`, `product_id`) SELECT 17, now(), 0, 3060.00, 3, null, 1, 5
--WHERE NOT EXISTS (SELECT * FROM `order_details` WHERE order_detail_id = 17);
--
--INSERT INTO `sg_congelados_db`.`order_details` (`order_detail_id`, `created_at`, `deleted`, `price`, `quantity`, `updated_at`, `order_id`, `product_id`) SELECT 18, now(), 0, 1280.00, 2, null, 1, 9
--WHERE NOT EXISTS (SELECT * FROM `order_details` WHERE order_detail_id = 18);
--INSERT INTO `sg_congelados_db`.`order_details` (`order_detail_id`, `created_at`, `deleted`, `price`, `quantity`, `updated_at`, `order_id`, `product_id`) SELECT 19, now(), 0, 2205.00, 3, null, 1, 10
--WHERE NOT EXISTS (SELECT * FROM `order_details` WHERE order_detail_id = 19);
--
--INSERT INTO `sg_congelados_db`.`order_details` (`order_detail_id`, `created_at`, `deleted`, `price`, `quantity`, `updated_at`, `order_id`, `product_id`) SELECT 20, now(), 0, 1440.00, 2, null, 1, 4
--WHERE NOT EXISTS (SELECT * FROM `order_details` WHERE order_detail_id = 20);
--INSERT INTO `sg_congelados_db`.`order_details` (`order_detail_id`, `created_at`, `deleted`, `price`, `quantity`, `updated_at`, `order_id`, `product_id`) SELECT 21, now(), 0, 2220.00, 3, null, 1, 7
--WHERE NOT EXISTS (SELECT * FROM `order_details` WHERE order_detail_id = 21);
