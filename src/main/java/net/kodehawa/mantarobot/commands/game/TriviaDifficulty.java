/*
 * Copyright (C) 2016-2018 David Alejandro Rubio Escares / Kodehawa
 *
 * Mantaro is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * Mantaro is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Mantaro.  If not, see http://www.gnu.org/licenses/
 */

package net.kodehawa.mantarobot.commands.game;

import net.kodehawa.mantarobot.commands.currency.profile.Badge;

public enum TriviaDifficulty {
    EASY, MEDIUM, HARD;

    /**
     * Looks up the Badge based on a String value, if nothing is found returns null.
     *
     * @param name The String value to match
     * @return The badge, or null if nothing is found.
     */
    public static TriviaDifficulty lookupFromString(String name) {
        for(TriviaDifficulty t : TriviaDifficulty.values()) {
            //field name search
            if(t.name().equalsIgnoreCase(name)) {
                return t;
            }
        }
        return null;
    }
}