package com.github.magus424.customjetbrainstheme.services

import com.github.magus424.customjetbrainstheme.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
