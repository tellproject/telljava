/*
 * (C) Copyright 2015 ETH Zurich Systems Group (http://www.systems.ethz.ch/) and others.
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
 *
 * Contributors:
 *     Markus Pilman <mpilman@inf.ethz.ch>
 *     Simon Loesing <sloesing@inf.ethz.ch>
 *     Thomas Etter <etterth@gmail.com>
 *     Kevin Bocksrocker <kevin.bocksrocker@gmail.com>
 *     Lucas Braun <braunl@inf.ethz.ch>
 */
package ch.ethz.tell;

import java.io.Serializable;

public class Field implements Serializable{

    private static final long serialVersionUID = 7526472295622776160L;

    public short index;
    public FieldType type;
    public String fieldName;
    public boolean nullable;

    public enum FieldType {
        NOTYPE((short) 0),
        NULLTYPE((short) 1),
        SMALLINT((short) 2),
        INT((short) 3),
        BIGINT((short) 4),
        FLOAT((short) 5),
        DOUBLE((short) 6),
        TEXT((short) 7), // this is used for CHAR and VARCHAR as well
        BLOB((short) 8);
        private short value;

        FieldType(short value) {
            this.value = value;
        }

        public final short toUnderlying() {
            return value;
        }

        public final void fromUnderlying(short value) {
            this.value = value;
        }
    }
}