<p align="center">
  <a href="https://themeselection.com/item/sneat-dashboard-free-django/" target="_blank">
    <img src="https://cdn.themeselection.com/ts-assets/sneat/logo/logo.png" alt="sneat-logo" width="60px" height="auto">
  </a>
</p>

<h1 align="center">
  <a href="#" target="_blank">
    Sneat x AI-Learning — Réseau social d’apprentissage & révision assistée par IA
  </a>
</h1>

<p align="center">
  Plateforme éducative intelligente intégrant IA, modération, et ressources partagées — construite sur <strong>Django + MongoDB</strong> et propulsée par <strong>Sneat Admin Template</strong>.
</p>

<p align="center">
  <a href="https://github.com/themeselection/sneat-bootstrap-html-django-admin-template-free/releases">
    <img src="https://img.shields.io/github/release/themeselection/sneat-bootstrap-html-django-admin-template-free.svg" alt="GitHub release">
  </a>
  <a href="https://github.com/themeselection/sneat-bootstrap-html-django-admin-template-free/blob/main/LICENSE">
    <img src="https://img.shields.io/github/license/themeselection/sneat-bootstrap-html-django-admin-template-free" alt="license">
  </a>
  <a href="https://x.com/Theme_Selection" target="_blank">
    <img alt="Twitter Follow" src="https://img.shields.io/twitter/follow/Theme_Selection">
  </a>
</p>

<kbd>
  <img src="https://cdn.themeselection.com/ts-assets/sneat/sneat-bootstrap-django-admin-template-free/banner/banner.png" alt="Sneat Banner">
</kbd>

---

## 🚀 Introduction

**AI-Learning** est une plateforme web intelligente permettant aux étudiants et enseignants de **partager, réviser et évaluer** leurs ressources pédagogiques dans un environnement social, assisté par IA.  
Basée sur **Sneat (Django Admin Template)**, elle combine ergonomie professionnelle, puissance IA et collaboration académique.

---

## 🎯 Problème à résoudre

Les étudiants dispersent leurs cours, TD et annales entre WhatsApp, Google Drive et PDF.  
Résultat : la recherche est lente, la qualité variable et la révision peu personnalisée.

---

## 💡 Proposition de valeur

Une **plateforme unique** où l’on partage, cherche et révise des cours, TD et annales avec l’aide de l’IA :

- 🔍 Recherche sémantique sur polycopiés, vidéos, et TD  
- 🧠 Résumés “prêts à réviser”  
- 🎯 Génération de QCM et quiz adaptatifs  
- 📰 Fil d’actualité pédagogique personnalisé  
- 🛡️ Détection du plagiat, triche et contenu NSFW  

---

## 👥 Acteurs de la plateforme

| Rôle | Description |
|------|-------------|
| 🎓 Étudiant | Consulte, révise et publie des ressources |
| 🧑‍🏫 Enseignant/Tuteur | Valide, corrige et publie des TD |
| 🧑‍💼 Modérateur pédagogique | Gère la qualité et la conformité des contenus |
| 👨‍💻 Administrateur | Supervise règles, filières et analytics |

---

## 🧩 Modules (Apps Django)

| Module | Description | IA Intégrée |
|--------|--------------|-------------|
| **Identité & Profils** | Gestion des comptes, filières, niveaux et objectifs de révision | Suggestion d’intérêts et de modules |
| **Ressources pédagogiques** | Upload de PDF/vidéos, métadonnées, tags | Résumé, extraction de formules, OCR |
| **Fil d’actualité IA** | Contenus recommandés selon profil et programme | Ranking multi-facteurs (pertinence, fraîcheur, qualité auteur) |
| **Quiz & Évaluation** | QCM, QCU, questions ouvertes, progression adaptative | Génération automatique de questions, feedback IA |
| **Modération & Intégrité** | Signalements, anti-plagiat, détection triche/NSFW | Analyse sémantique, scoring de risque |
| **Recherche & Découverte** | Recherche par concepts et similarité sémantique | Embeddings vectoriels texte/vidéo |

---

## ⚙️ Architecture technique

**Backend :**
- Django 5 + Django REST Framework  
- MongoDB + Atlas Search / Vector Search  
- Celery + Redis pour les tâches asynchrones  
- MinIO / S3 pour le stockage des médias  

**IA & NLP :**
- Embeddings (E5 / Instructor)
- Résumé de texte (LLM)
- OCR (Tesseract)
- Transcription audio (Whisper)
- Anti-plagiat (similarité vectorielle)

**Frontend :**
- Sneat Django Admin Template (Bootstrap 5)
- Responsive & modular UI

---

## 📊 KPIs Clés

- ✅ Taux de réussite aux quiz  
- 📈 Rétention à 7/30 jours  
- ⏱️ Temps de révision utile  
- 🧾 Pourcentage de ressources validées  
- 🔍 Recherches sémantiques abouties  

---

## 🧪 Stack & Outils

| Domaine | Outils |
|----------|--------|
| Framework | Django 5, Django REST Framework |
| Base de données | MongoDB (Atlas), MySQL (optionnel) |
| File Storage | MinIO / AWS S3 |
| Async | Celery + Redis |
| AI | Transformers, Whisper, Instructor, OCR |
| Frontend | Sneat Bootstrap Django Template |
| DevOps | Docker, Jenkins, SonarQube, Nexus |
| Tests | Pytest / Unittest |
| Auth | JWT / Django AllAuth |

---

## 🏗️ Installation

1. **Cloner le projet :**
   ```bash
   git clone https://github.com/yourusername/ai-learning-platform.git
   cd ai-learning-platform
