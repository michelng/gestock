# gestock
On souhaite developper une application de gestion de stock pour repondre aux besoins de nos clients.

Cette application permet de :

- Creer des profils pour chaque entreprise.

- Une Entrepeise a un ou plusieurs utilisateurs

- Parametrer les categories d'articles (produit)

- Une Entreprise a un ou plusieurs articles (produit)

- Une entreprise a un ou plusiers Client, Fournisseurs, ....

- Passer des commandes clients
	- Une commande client a un seul client
	- Une commande client a un ou plusieurs articles (produits)
	- Une commande client effectue une sortie de stock pour les articles en question

- Passer des commandes fournisseurs
	-Une commande fournisseur a un seul fournisseur
	-Une commande fournisseur a un ou plusieurs articles (produits)
	-Une commande fournisseur effectue une entree de stock pour les articles en question

- Effectuer des ventes au magasin
	-Une vente a 1 ou plusieurs articles (produit)
	-Une vente effectue une sortie de stock pour lesarticles en question

- Consulter l'etat du stock de chaque article
	-Voir la quantite de stock de l'article en temps reel
	-Effectuer des corrections de stock (mettre a jour le stock)

Fonctionnalites :
* L'application doit pouvoir envoyer automatiquement des emails aux fournisseurs lors de la creation d'une nouvelle commande fournisseur en se basant sur un Template pre-defini

* L'application doit pouvoir envoyer un email de confirmation aux clients lors de la creation de la commande client en utilisant un Template pre-defini

* L'application doit afficher une notification lorsque un article (produit) attein un seuil min de stock

* L'application doit avoir un tableau de bord qui affiche de statistiques (a definir)

* L'application offre une console d'administration pour les entreprises pour gerer les utilisateurs, parametrage

* L'application offre un historique des commandes d'un (client / fournisseur)

* L'application offre un etat d'avancement des commandes 

* L'application dois etre securisee avec un systheme d`authentification
