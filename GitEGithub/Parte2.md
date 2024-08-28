# Remover arquivos da área de stage

git status

git reset

# Desfazer modificações não salvas

git status

git reset

git clean -df

git checkout -- .

# Deletar o último commit sem deletar modificações nos arquivos

git status

git reset --soft HEAD~1

# Deletar commits e também modificações nos arquivos

git status

git reset --hard <código do commit> ==> deleta tudo acima desse commit

# Atualizar repositorio local com o repositorio remoto

git status

git pull <nome do remote> <nome do branch>

exemplo:
git pull origin main

# Resolver push com historicos diferentes

git pull <nome do remote> <nome do branch> antes de fazer o git push

git push

# Resolvendo pull com conflito

git pull <nome do remote> <nome do branch>

RESOLVA O CONFLITO

git add .

git commit -m "Mensagem explicativa"

git push

# Sobrescrever histórico no Github

git push -f <nome do remote> <nome do branch>

Força o push, pegando que está na sua máquina e forçando push no github. Perigoso!
Faz com que o MERGE não aconteça, por exemplo. Mas CUIDADO!

# Apontar o projeto para outro repositório remoto

git remote set-url origin git@github.com:seuusuario/seurepositorio.git

git push -u origin main
