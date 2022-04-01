package com.anye.lossaltamontes

class Operaciones {
    companion object{
        var listaEstudiantes = ArrayList<Estudiantes>()

        fun registrar(estudiantes: Estudiantes){
            listaEstudiantes.add(estudiantes)
        }
        fun getList(): ArrayList<Estudiantes>{
            return listaEstudiantes
        }
    }



}