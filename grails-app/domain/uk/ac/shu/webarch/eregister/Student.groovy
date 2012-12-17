package uk.ac.shu.webarch.eregister

class Student {

String name
String studentNumber


static hasMany = [
      registration_entries_by_this_student: RegEntry
]

static mappedBy = [
      registration_entries_by_this_student:'class_Student'
]


    static constraints = {
    }
}
