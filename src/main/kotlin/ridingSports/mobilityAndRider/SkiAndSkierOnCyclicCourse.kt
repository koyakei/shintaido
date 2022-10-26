package ridingSports.mobilityAndRider

import ridingSports.course.Course
import ridingSports.course.CyclicCourse

interface SkiAndSkierOnCyclicCourse :SkiAndSkier{
    override val course: CyclicCourse


}