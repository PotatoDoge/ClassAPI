# Comandos básicos de Git

---

## Crear / clonar un repositorio
```bash
git init              # Inicializar repo en carpeta actual
git clone <url>       # Clonar un repo existente
```

---

## El flujo diario (los más importantes)
```bash
git status            # Ver estado de los archivos
git add <archivo>     # Agregar archivo al staging
git add .             # Agregar todos los cambios
git commit -m "msg"   # Guardar los cambios con mensaje
git push              # Subir cambios al remoto
git pull              # Bajar cambios del remoto
```

---

## Ver historial
```bash
git log               # Ver historial de commits
git log --oneline     # Historial resumido (muy útil)
git diff              # Ver cambios sin agregar aún
```

---

## Ramas (branches)
```bash
git branch             # Ver ramas existentes
git branch <nombre>    # Crear una rama
git checkout <rama>    # Cambiarse a una rama
git checkout -b <rama> # Crear y cambiarse en un paso
git merge <rama>       # Fusionar una rama a la actual
```

---

## Deshacer cosas
```bash
git restore <archivo>          # Descartar cambios sin guardar
git restore --staged <archivo> # Sacar del staging
git revert <commit>            # Revertir un commit (seguro)
```

---
