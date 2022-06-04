create table orientador(
Id  int  primary key auto_increment,
Nome varchar (155) not null
);

create table aluno(
Id  int  primary key auto_increment,
Nome varchar (155) not null,
Id_orientador int not null,
foreign key (Id_orientador ) references orientador(Id)
);

create table disciplina(
Id  int  primary key auto_increment,
Nome varchar (155) not null
);

create table aluno_disciplina(
Id_aluno int,
Id_disciplina int ,
primary key (Id_aluno, Id_disciplina),
foreign key (Id_aluno ) references aluno(Id),
foreign key (Id_disciplina ) references disciplina(Id)
);

insert into orientador(Nome ) values ( 'Paulo Silveira'),( 'Felipe Neto'), ('Thais Mendes') ;
insert into aluno(Nome, Id_orientador ) values
('Joanatas Fernandes',(select Id from orientador where Nome ='Paulo Silveira') ),
('Elias Meireles',(select Id from orientador where Nome ='Thais Mendes') ),
('Kaique Cairam',(select Id from orientador where Nome ='Felipe Neto') ),
('Kaique Cairam',(select Id from orientador where Nome ='Thais Mendes') ),
('Kaique Cairam',(select Id from orientador where Nome ='Felipe Neto') ),
('Joanatas Fernandes',(select Id from orientador where Nome ='Thais Mendes') );

insert into disciplina(Nome) values ('Portugues'), ('Matématica'), ('Ingles'),('Geografia');

insert into aluno_disciplina(Id_aluno, Id_disciplina) values 
((select Id from aluno where Nome = 'Elias Meireles'),( select Id from disciplina where Nome = 'Ingles'));





