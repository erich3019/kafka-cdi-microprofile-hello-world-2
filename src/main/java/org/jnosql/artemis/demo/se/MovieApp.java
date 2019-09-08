/*
 * Copyright (c) 2017 Otávio Santana and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Apache License v2.0 is available at http://www.opensource.org/licenses/apache2.0.php.
 *
 * You may elect to redistribute this code under either of these licenses.
 *
 * Contributors:
 *
 * Otavio Santana
 */

package org.jnosql.artemis.demo.se;


import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

public class MovieApp {


    public static void main(String[] args) {

        SeContainer container = SeContainerInitializer.newInstance().initialize();
        final MoviePublisherService service = container.select(MoviePublisherService.class).get();
        service.sendMessage(new Movie("The Big Flame", "Drama"));
        service.sendMessage(new Movie("Beautiful People", "Comedy"));
        service.sendMessage(new Movie("Barking Dogs Never Bite (Flandersui gae)", "Comedy|Horror"));
        service.sendMessage(new Movie("Snow Creature, The", "Horror"));
        service.sendMessage(new Movie("Osama", "Drama"));

    }

    private MovieApp() {
    }
}
