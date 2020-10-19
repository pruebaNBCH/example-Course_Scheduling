/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package curriculumcourse.curriculumcourse;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Day implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    private int dayIndex;
    private java.util.List<Period> periodList;

    private java.lang.Long id;

    public Day() {
    }

    public int getDayIndex() {
        return this.dayIndex;
    }

    public void setDayIndex(int dayIndex) {
        this.dayIndex = dayIndex;
    }

    public java.util.List<Period> getPeriodList() {
        return this.periodList;
    }

    public void setPeriodList(
            java.util.List<Period> periodList) {
        this.periodList = periodList;
    }

    public java.lang.Long getId() {
        return this.id;
    }

    public void setId(java.lang.Long id) {
        this.id = id;
    }

    public Day(int dayIndex,
               java.util.List<Period> periodList,
               java.lang.Long id) {
        this.dayIndex = dayIndex;
        this.periodList = periodList;
        this.id = id;
    }
}