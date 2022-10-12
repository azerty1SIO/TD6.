<?php
session_start();
?>

<html>
<head> <link href="style.css" media="all" rel="stylesheet" type="text/css"/> </head>
<body> </html>
<?php
include '_conf.php';
if ($_SESSION["type"] ==1) //si connexion en prof
  {
    ?>
    <html>
    <ul class="nav">
    <li><a href="accueil.php">Accueil</a></li>
    <li><a href="perso.php">Profil</a></li>
    <li><a href="cr.php">Compte rendus</a></li>
    </ul> </html> <?php
  }
else
  {
    ?>
    <html>
    <ul class="nav">
    <li><a href="accueil.php">Accueil</a></li>
    <li><a href="perso.php">Profil</a></li>
    <li><a href="cr.php">Compte rendus</a></li>
    <li><a href="ccr.php">Nouveau compte-rendu</a></li>
    </ul> </html> <?php
  }
 if($connexion = mysqli_connect($serveurBDD,$userBDD,$mdpBDD,$nomBDD))
      {
        $id=$_SESSION["id"];     
        $requete="SELECT * FROM UTILISATEUR WHERE UTILISATEUR.num=$_SESSION[id]"; //recupere tous les comptes rendus par date decroissante

 $resultat = mysqli_query($connexion, $requete);
        while($donnees = mysqli_fetch_assoc($resultat))
          {
            
            $nom=$donnees['nom'];
            $prenom=$donnees['prenom'];
            $tel=$donnees['tel'];
            $email=$donnees['email'];
           if ($donnees['option']==1){ 
            $option="slam";
          }
           else {
                 $option="sisr";
                }
      }
echo "nom : $nom",
     "prenom : $prenom",
      " tel : $tel",
      " email: $email";    
          }

//INSERT INTO CR (date,datetime,description,num_utilisateur) VALUES ('$date',NOW(),'$contenu','$id');
  
?>

