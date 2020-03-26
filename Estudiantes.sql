create database bd_estudiantes;
use bd_estudiantes;

create table Estudiantes(
CodigoCarnet varchar(20) primary key,
NombreEstudiante varchar(60) not null,
DireccionEstudiante varchar(60) not null,
TelefonoEstudiante varchar(60),
CorreoEstudiante varchar(40),
EstadoEstudiante varchar(1)
)engine = InnoDB;

