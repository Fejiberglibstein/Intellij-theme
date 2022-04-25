package com.github.fejiberglibstein.intellijtheme.services

import com.intellij.openapi.project.Project
import com.github.fejiberglibstein.intellijtheme.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
