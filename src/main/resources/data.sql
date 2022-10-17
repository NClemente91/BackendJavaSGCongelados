--CATEGORIES
INSERT INTO `sg_congelados_db`.`categories` (`category_id`, `created_at`, `deleted`, `name`, `updated_at`) SELECT 1, now(), 0, 'frutas', null
WHERE NOT EXISTS (SELECT * FROM `categories` WHERE category_id = 1);
INSERT INTO `sg_congelados_db`.`categories` (`category_id`, `created_at`, `deleted`, `name`, `updated_at`) SELECT 2, now(), 0, 'verduras', null
WHERE NOT EXISTS (SELECT * FROM `categories` WHERE category_id = 2);
INSERT INTO `sg_congelados_db`.`categories` (`category_id`, `created_at`, `deleted`, `name`, `updated_at`) SELECT 3, now(), 0, 'mix', null
WHERE NOT EXISTS (SELECT * FROM `categories` WHERE category_id = 3);

--PRODUCTS
INSERT INTO `sg_congelados_db`.`products` (`product_id`, `created_at`, `deleted`, `description`, `image_url`, `name`, `stock`, `unit_price`, `updated_at`, `category_id`)
SELECT 1, now(), 0, 'Champiñones seleccionados lavados y feteados - 1Kg', 'https://conosud-sa.com.ar/templates/yootheme/cache/6c/Champi-6c0fff45.webp', 'Champiñones', 50, 1000.00, null, 2
WHERE NOT EXISTS (SELECT * FROM `products` WHERE product_id = 1);
INSERT INTO `sg_congelados_db`.`products` (`product_id`, `created_at`, `deleted`, `description`, `image_url`, `name`, `stock`, `unit_price`, `updated_at`, `category_id`)
SELECT 2, now(), 0, 'Mix de frutos del bosque: Arándanos, Frutillas y Moras - 1Kg', 'https://conosud-sa.com.ar/templates/yootheme/cache/2f/Frutos%20rojos-2f312473.webp', 'Frutos Rojos', 42, 950.00, null, 1
WHERE NOT EXISTS (SELECT * FROM `products` WHERE product_id = 2);
INSERT INTO `sg_congelados_db`.`products` (`product_id`, `created_at`, `deleted`, `description`, `image_url`, `name`, `stock`, `unit_price`, `updated_at`, `category_id`)
SELECT 3, now(), 0, 'Cebollas frescas peladas, cortadas en cubos - 1Kg', 'https://conosud-sa.com.ar/templates/yootheme/cache/8c/Cebollas%20en%20cubos-8cd728a6.webp', 'Cebollas', 56, 670.00, null, 2
WHERE NOT EXISTS (SELECT * FROM `products` WHERE product_id = 3);
INSERT INTO `sg_congelados_db`.`products` (`product_id`, `created_at`, `deleted`, `description`, `image_url`, `name`, `stock`, `unit_price`, `updated_at`, `category_id`)
SELECT 4, now(), 0, 'Pimientos rojos descorazonados, cortados en cubos - 1Kg', 'https://conosud-sa.com.ar/templates/yootheme/cache/65/Pimiento%20rojo%20en%20cubos-6571c2fb.webp', 'Pimientos', 39, 720.00, null, 2
WHERE NOT EXISTS (SELECT * FROM `products` WHERE product_id = 4);
INSERT INTO `sg_congelados_db`.`products` (`product_id`, `created_at`, `deleted`, `description`, `image_url`, `name`, `stock`, `unit_price`, `updated_at`, `category_id`)
SELECT 5, now(), 0, 'Arándanos enteros - 1Kg', 'https://conosud-sa.com.ar/templates/yootheme/cache/5b/Aranadanos-5bce733f.webp', 'Arándanos', 57, 1020.00, null, 1
WHERE NOT EXISTS (SELECT * FROM `products` WHERE product_id = 5);
INSERT INTO `sg_congelados_db`.`products` (`product_id`, `created_at`, `deleted`, `description`, `image_url`, `name`, `stock`, `unit_price`, `updated_at`, `category_id`)
SELECT 6, now(), 0, 'Frutillas enteras, frescas y sanas - 1Kg', 'https://conosud-sa.com.ar/templates/yootheme/cache/28/B_Frutillas-28dd6d64.webp', 'Frutillas', 50, 1060.00, null, 1
WHERE NOT EXISTS (SELECT * FROM `products` WHERE product_id = 6);
INSERT INTO `sg_congelados_db`.`products` (`product_id`, `created_at`, `deleted`, `description`, `image_url`, `name`, `stock`, `unit_price`, `updated_at`, `category_id`)
SELECT 7, now(), 0, 'Relleno para preparar tarta de espinaca, pimientos rojos y cebolla -  1Kg', 'https://conosud-sa.com.ar/templates/yootheme/cache/61/Mix%20para%20tarta%20espinaca-619b6fb7.webp', 'Mix tarta de espinaca', 30, 740.00, null, 3
WHERE NOT EXISTS (SELECT * FROM `products` WHERE product_id = 7);
INSERT INTO `sg_congelados_db`.`products` (`product_id`, `created_at`, `deleted`, `description`, `image_url`, `name`, `stock`, `unit_price`, `updated_at`, `category_id`)
SELECT 8, now(), 0, 'Cubos de pimientos rojos, verdes y amarillos más cubos de cebolla - 1Kg', 'https://conosud-sa.com.ar/templates/yootheme/cache/7b/mix-tacos-7bd2b2dc.webp', 'Mix para tacos', 43, 820.00, null, 3
WHERE NOT EXISTS (SELECT * FROM `products` WHERE product_id = 8);
INSERT INTO `sg_congelados_db`.`products` (`product_id`, `created_at`, `deleted`, `description`, `image_url`, `name`, `stock`, `unit_price`, `updated_at`, `category_id`)
SELECT 9, now(), 0, 'Papas frescas, limpias, cortadas en cubos 20x20mm - 1Kg', 'https://conosud-sa.com.ar/templates/yootheme/cache/bc/Cubos%20de%20Papa-bc5e8998.webp', 'Papas', 43, 640.00, null, 2
WHERE NOT EXISTS (SELECT * FROM `products` WHERE product_id = 9);
INSERT INTO `sg_congelados_db`.`products` (`product_id`, `created_at`, `deleted`, `description`, `image_url`, `name`, `stock`, `unit_price`, `updated_at`, `category_id`)
SELECT 10, now(), 0, 'Zapallo (calabaza) sometido a proceso de lavado, cortado en cubos, blanqueado - 1Kg', 'https://conosud-sa.com.ar/templates/yootheme/cache/4d/Zapallo-4d056b2a.webp', 'Zapallo', 45, 735.00, null, 2
WHERE NOT EXISTS (SELECT * FROM `products` WHERE product_id = 10);
INSERT INTO `sg_congelados_db`.`products` (`product_id`, `created_at`, `deleted`, `description`, `image_url`, `name`, `stock`, `unit_price`, `updated_at`, `category_id`)
SELECT 11, now(), 0, 'Cortado en cubos a partir de mangos frescos, sanos y recién cosechados - 1Kg', 'https://conosud-sa.com.ar/templates/yootheme/cache/da/mango-dafc892a.webp', 'Mango', 50, 1080.00, null, 1
WHERE NOT EXISTS (SELECT * FROM `products` WHERE product_id = 11);
INSERT INTO `sg_congelados_db`.`products` (`product_id`, `created_at`, `deleted`, `description`, `image_url`, `name`, `stock`, `unit_price`, `updated_at`, `category_id`)
SELECT 12, now(), 0, 'Remolacha sometida a proceso de lavado, cortado en cubos, blanqueado - 1Kg', 'https://conosud-sa.com.ar/templates/yootheme/cache/59/Remolacha-59d34d91.webp', 'Remolacha', 45, 875.00, null, 2
WHERE NOT EXISTS (SELECT * FROM `products` WHERE product_id = 12);
INSERT INTO `sg_congelados_db`.`products` (`product_id`, `created_at`, `deleted`, `description`, `image_url`, `name`, `stock`, `unit_price`, `updated_at`, `category_id`)
SELECT 13, now(), 0, 'El producto se elabora a partir de granos de arvejas verdes frescas, sanas y recién cosechadas - 1Kg', 'https://conosud-sa.com.ar/templates/yootheme/cache/0e/Arvejas-0eb48650.webp', 'Arvejas', 45, 970.00, null, 2
WHERE NOT EXISTS (SELECT * FROM `products` WHERE product_id = 13);
INSERT INTO `sg_congelados_db`.`products` (`product_id`, `created_at`, `deleted`, `description`, `image_url`, `name`, `stock`, `unit_price`, `updated_at`, `category_id`)
SELECT 14, now(), 0, 'Granos de choclos super dulces - 1Kg', 'https://conosud-sa.com.ar/templates/yootheme/cache/72/Granos%20de%20choclo-722e0ca1.webp', 'Choclo', 47, 825.00, null, 2
WHERE NOT EXISTS (SELECT * FROM `products` WHERE product_id = 14);
INSERT INTO `sg_congelados_db`.`products` (`product_id`, `created_at`, `deleted`, `description`, `image_url`, `name`, `stock`, `unit_price`, `updated_at`, `category_id`)
SELECT 15, now(), 0, 'Chauchas frescas, despuntadas y cortadas - 1Kg', 'https://conosud-sa.com.ar/templates/yootheme/cache/ec/Chauchas-ec1fd838.webp', 'Chaucha', 38, 780.00, null, 2
WHERE NOT EXISTS (SELECT * FROM `products` WHERE product_id = 15);
INSERT INTO `sg_congelados_db`.`products` (`product_id`, `created_at`, `deleted`, `description`, `image_url`, `name`, `stock`, `unit_price`, `updated_at`, `category_id`)
SELECT 16, now(), 0, 'El producto se elabora a partir de Cabezas de brócoli frescas - 1Kg', 'https://conosud-sa.com.ar/templates/yootheme/cache/65/Brocoli-65d2420d.webp', 'Brócoli', 46, 940.00, null, 2
WHERE NOT EXISTS (SELECT * FROM `products` WHERE product_id = 16);
INSERT INTO `sg_congelados_db`.`products` (`product_id`, `created_at`, `deleted`, `description`, `image_url`, `name`, `stock`, `unit_price`, `updated_at`, `category_id`)
SELECT 17, now(), 0, 'Hojas frescas de espinacas, limpias y cortadas - 1Kg', 'https://conosud-sa.com.ar/templates/yootheme/cache/98/Espinacas-982ea284.webp', 'Espinaca', 42, 890.00, null, 2
WHERE NOT EXISTS (SELECT * FROM `products` WHERE product_id = 17);
INSERT INTO `sg_congelados_db`.`products` (`product_id`, `created_at`, `deleted`, `description`, `image_url`, `name`, `stock`, `unit_price`, `updated_at`, `category_id`)
SELECT 18, now(), 0, 'Mix de Granos de choclo, arvejas, chauchas y zanahorias - 1Kg', 'https://conosud-sa.com.ar/templates/yootheme/cache/43/Ensalada%20Primavera-43f15bd2.webp', 'Mix primavera', 44, 930.00, null, 3
WHERE NOT EXISTS (SELECT * FROM `products` WHERE product_id = 18);
INSERT INTO `sg_congelados_db`.`products` (`product_id`, `created_at`, `deleted`, `description`, `image_url`, `name`, `stock`, `unit_price`, `updated_at`, `category_id`)
SELECT 19, now(), 0, 'Mix de granos de choclo, arvejas, cubos de zanahoria, chauchas trozadas y cubos de tomate - 1Kg', 'https://conosud-sa.com.ar/templates/yootheme/cache/47/MixSopa-470b0c38.webp', 'Mix sopa de vegetales', 34, 670.00, null, 3
WHERE NOT EXISTS (SELECT * FROM `products` WHERE product_id = 19);
INSERT INTO `sg_congelados_db`.`products` (`product_id`, `created_at`, `deleted`, `description`, `image_url`, `name`, `stock`, `unit_price`, `updated_at`, `category_id`)
SELECT 20, now(), 0, 'Wok de Brócoli molido, Chaucha, Maíz, Cebolla en cubo, Zanahoria, Champiñon en feta - 1Kg', 'https://conosud-sa.com.ar/templates/yootheme/cache/8f/WokVegetales-8f6e279d.webp', 'Wok de vegetales', 52, 750.00, null, 3
WHERE NOT EXISTS (SELECT * FROM `products` WHERE product_id = 20);
INSERT INTO `sg_congelados_db`.`products` (`product_id`, `created_at`, `deleted`, `description`, `image_url`, `name`, `stock`, `unit_price`, `updated_at`, `category_id`)
SELECT 21, now(), 0, 'Mix de Arvejas, papas y zanahorias - 1Kg', 'https://conosud-sa.com.ar/templates/yootheme/cache/74/Ensalada%20Jardinera-745e2a24.webp', 'Mix jardinera', 43, 770.00, null, 3
WHERE NOT EXISTS (SELECT * FROM `products` WHERE product_id = 21);
INSERT INTO `sg_congelados_db`.`products` (`product_id`, `created_at`, `deleted`, `description`, `image_url`, `name`, `stock`, `unit_price`, `updated_at`, `category_id`)
SELECT 22, now(), 0, 'Relleno para preparar tarta de zucchini - 1Kg', 'https://conosud-sa.com.ar/templates/yootheme/cache/d7/TartaZucchini-d7efbbfd.webp', 'Mix tarta de zucchini', 46, 920.00, null, 3
WHERE NOT EXISTS (SELECT * FROM `products` WHERE product_id = 22);
INSERT INTO `sg_congelados_db`.`products` (`product_id`, `created_at`, `deleted`, `description`, `image_url`, `name`, `stock`, `unit_price`, `updated_at`, `category_id`)
SELECT 23, now(), 0, 'Zanahorias frescas cortadas en cubos de 10x10mm - 1Kg', 'https://conosud-sa.com.ar/templates/yootheme/cache/c3/Zanahorias%20en%20cubo-c3b5c99a.webp', 'Zanahoria', 47, 825.00, null, 2
WHERE NOT EXISTS (SELECT * FROM `products` WHERE product_id = 23);

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
