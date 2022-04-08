INSERT INTO Departamento (id, titulo) VALUES (1, 'Financeiro');
INSERT INTO Departamento (id, titulo) VALUES (2, 'Comercial');
INSERT INTO Departamento (id, titulo) VALUES (3, 'Desenvolvimento');

INSERT INTO Pessoa (id, nome, idDepartamento) VALUES (1, 'Camila', 1);
INSERT INTO Pessoa (id, nome, idDepartamento) VALUES (2, 'Pedro', 2);
INSERT INTO Pessoa (id, nome, idDepartamento) VALUES (3, 'Fabiano', 3);
INSERT INTO Pessoa (id, nome, idDepartamento) VALUES (4, 'Raquel', 3);
INSERT INTO Pessoa (id, nome, idDepartamento) VALUES (5, 'Patricia', 3);
INSERT INTO Pessoa (id, nome, idDepartamento) VALUES (6, 'Joaquim', 1);


INSERT INTO Tarefa (id, titulo, descricao, prazo, idDepartamento, duracao, idPessoa, finalizado)
	VALUES (1001, 'Validar NF Janeiro', 'Validar notas recebidas no mês de Janeiro', '20220215', 1, 14, 1, true);
INSERT INTO Tarefa (id, titulo, descricao, prazo, idDepartamento, duracao, idPessoa, finalizado)
	VALUES (1002, 'Bug 352', 'Corrigir bug 352 na versão 1.25', '20220510', 3, 25, null, false);
INSERT INTO Tarefa (id, titulo, descricao, prazo, idDepartamento, duracao, idPessoa, finalizado)
	VALUES (1003, 'Liberação da versão 1.24', 'Disponibilizar o pacote para testes', '20220202', 3, 2, 3, false);
INSERT INTO Tarefa (id, titulo, descricao, prazo, idDepartamento, duracao, idPessoa, finalizado)
	VALUES (1004, 'Reunião A', 'Reunião com cliente A para apresentação do produto', '20220205', 2, 5, null, false);
INSERT INTO Tarefa (id, titulo, descricao, prazo, idDepartamento, duracao, idPessoa, finalizado)
	VALUES (1005, 'Reunião final', 'Fechamento do contrato', '20220328', 2, 6, null, false);
INSERT INTO Tarefa (id, titulo, descricao, prazo, idDepartamento, duracao, idPessoa, finalizado)
	VALUES (1006, 'Pagamento 01/2022', 'Realizar pagamento dos fornecedores', '20220131', 1, 6, 1, true);
INSERT INTO Tarefa (id, titulo, descricao, prazo, idDepartamento, duracao, idPessoa, finalizado)
	VALUES (1007, 'Bug 401', 'Corrigir bug 401 na versão 1.20', '20220201', 3, 2, 4, true);
INSERT INTO Tarefa (id, titulo, descricao, prazo, idDepartamento, duracao, idPessoa, finalizado)
	VALUES (1008, 'Bug 399', 'Corrigir bug 399 na versão 1.20', '20220128', 3, 6, 5, true);
INSERT INTO Tarefa (id, titulo, descricao, prazo, idDepartamento, duracao, idPessoa, finalizado)
	VALUES (1009, 'Reunião B', 'Reunião com o Cliente B para apresentação do produto', '20220131', 2, 5, 2, true);
INSERT INTO Tarefa (id, titulo, descricao, prazo, idDepartamento, duracao, idPessoa, finalizado)
	VALUES (1010, 'Validar NF Fevereiro', 'Validar notas fiscais recebidas no mês de Fevereiro', '20220315', 1, 14, 6, false);


	

	

	