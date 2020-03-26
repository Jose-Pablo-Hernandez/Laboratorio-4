create database bd_estudiantes;
use bd_estudiantes;

create table Estudiantes(
CodigoCarnet varchar(20) primary key,
NombreEstudiante varchar(60) not null,
DireccionEstudiante varchar(60) not null,
TelefonoEstuiante varchar(60)not null,
CorreoEstudiante varchar(40)not null,
EstadoEstudiante varchar(1)not null
)engine = InnoDB;

