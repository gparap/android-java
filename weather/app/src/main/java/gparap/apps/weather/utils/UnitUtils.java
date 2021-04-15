/*
 * Copyright 2021 gparap
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package gparap.apps.weather.utils;

public class UnitUtils {
    public enum Unit {
        /**
         * Temperature: Celsius,
         * Wind Speed:  meter/sec
         */
        METRIC,

        /**
         * Temperature:	Fahrenheit,
         * Wind Speed:  miles/hour
         */
        IMPERIAL
    }

    private static UnitUtils instance;
    private Unit unit = Unit.METRIC;

    public static UnitUtils getInstance() {
        if (instance == null) {
            instance = new UnitUtils();
        }
        return instance;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    private UnitUtils() {
    }
}