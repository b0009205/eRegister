package uk.ac.shu.webarch.eregister

class RegClass {


String name
Instructor class_Instructor
Course class_Course


static hasMany = [
      registration_sheets: RegSheet
]

static mappedBy = [
      registration_sheets:'class_RegClass'
]

    static constraints = {
    }
}
