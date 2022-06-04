select a.Nome as 'Nome Aluno', o.Nome as 'Nome Orientador', d.Nome as 'Nome Disciplina'
from aluno a 
join orientador o on a.Id_orientador = o.Id 
left join aluno_disciplina ad on ad.Id_aluno = a.Id 
left join disciplina d on d.Id = ad.Id_disciplina
where a.Nome = 'Joanatas Fernandes' ;

select count(Nome) as total , Nome from aluno 
group by  Nome;

select a.Nome as 'Nome Aluno'
from aluno a 
where a.Id not in (select Id_aluno from aluno_disciplina);
