# tasks

## Task 1

Leer sobre clean architecture ya que esta kata sigue sus principios (solo si no sabes nada de Clean Architecture).
Crea un proyecto nuevo de android en android studio
Configura tu proyecto para poder hacer uso de la librería de dagger 2


## Task 2
Implementa tu objeto de dominio de nombre Character con los siguientes atributos name, photo, cover, description.
Implementa un objeto de dominio de nombre Abilities con los siguientes atributos: accelerate, steer, brake, reverse, lookBehind, drift;
Agrega a tu objeto Character un atributo de tipo Abilities

## Task 3
Implementa una clase FAKE DATA SOURCE responsable de generar una lista de personajes
Implementa una clase REPOSITORY que tendrá una dependencia con FAKE DATA SOURCE
Implementa un modulo de dagger para proveer una dependencia de tu REPOSITORY
Implementa un componente para especificar en donde se van a inyectar tus dependencias.

## Task 4
Implementa un GET ALL CHARACTERS USE CASE que obtenga TODOS los personajes con dependencia a REPOSITORY
Configura tu caso de uso para que dagger pueda inyectar una dependencia de REPOSITORY

## Task 5
Implementa un CHARACTERS PRESENTER para mostrar una lista de personajes en una vista con dependencia a GET ALL CHARACTERS USE CASE
Configura tu presenter para que dagger pueda inyectar una dependencia de GET ALL CHARACTERS USE CASE


## Task 6
Implementa una vista android activity, example.miaguicam.mario_kart_dagger2.view.activity.fragment u otra con dependencia a CHARACTERS PRESENTER
Configura tu vista android para que dagger pueda inyectar una dependencia de CHARACTERS PRESENTER
Muestra a los personajes de la forma que mas te guste.


