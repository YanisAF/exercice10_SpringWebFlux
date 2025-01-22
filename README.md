# exercice10_SpringWebFlux

**Contexte** :
Une application de réservation de salles de réunion en entreprise nécessite une gestion des rôles pour contrôler l’accès à certaines fonctionnalités.

#### **Instructions** :
1. Configurez Spring Security avec deux rôles:
    - `USER` : Peut consulter les salles disponibles.
    - `ADMIN` : Peut ajouter ou supprimer des salles.

2. Implémentez les endpoints suivants:
    - **`GET /api/rooms`** : Liste toutes les salles disponibles (accessible à tous les utilisateurs authentifiés).
    - **`POST /api/rooms`** : Ajoute une nouvelle salle (accessible uniquement aux administrateurs).
    - **`DELETE /api/rooms/{id}`** : Supprime une salle donnée (accessible uniquement aux administrateurs).
