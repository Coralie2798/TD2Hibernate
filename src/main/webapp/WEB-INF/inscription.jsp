<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inscription</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>

</head>
<body>
<h2>Inscription :</h2>
<br>
<form method="post">
<div class="mb-3">
  <label for="formGroupExampleInput" class="form-label"> login (*) </label>
  <input type="text" class="form-control" id="formGroupExampleInput" name="login" required="required">
</div>

<label for="inputPassword5" class="form-label">Mot de passe (*)</label>
<input type="password" required="required" id="inputPassword5" class="form-control" 
aria-describedby="passwordHelpBlock" name="mdp">
<!--  pattern="[A-Za-z0-9,.;/!?:&]{8-20}"-->
<div id="passwordHelpBlock" class="form-text">
	<!--Votre mot de passe doit faire entre 8 et 20 caractères, contenir des lettres et chiffres, pas d'espaces ni d'emoji.-->
</div>

<div class="mb-3">
  <label for="formGroupExampleInput" class="form-label"> Adresse</label>
  <input type="text" class="form-control" id="formGroupExampleInput" name="adresse" >
</div>
<div class="mb-3">
  <label for="formGroupExampleInput" class="form-label"> Ville</label>
  <input type="text" class="form-control" id="formGroupExampleInput" name="ville">
</div>
<div class="mb-3">
  <label for="formGroupExampleInput" class="form-label"> Code postal</label>
  <input type="text" class="form-control" id="formGroupExampleInput" name="cp">
</div>
<div class="mb-3">
  <label for="formGroupExampleInput" class="form-label"> Téléphone</label>
  <input type="text" class="form-control" id="formGroupExampleInput" placeholder="0XXXXXXXXXX" pattern="[0-9]{10}" name="telephone">
</div>
<div class="mb-3">
  <label for="formGroupExampleInput2" class="form-label">Adresse mail</label>
  <input type="text" class="form-control" id="formGroupExampleInput2" name="email">
</div>
<input type="radio" class="btn-check" name="formule" value="classique" id="option1" autocomplete="off" checked>
<label class="btn btn-secondary" for="option1">Classique </label>

<input type="radio" class="btn-check" name="formule" value="abonne" id="option2" autocomplete="off">
<label class="btn btn-secondary" for="option2">Abonné</label>

<input type="radio" class="btn-check" name="formule" value="vip" id="option3" autocomplete="off">
<label class="btn btn-secondary" for="option3">VIP</label>

<p>(*) : champs obligatoires</p>
<button type="submit" class="btn btn-success"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-send-fill" viewBox="0 0 16 16">
  <path d="M15.964.686a.5.5 0 0 0-.65-.65L.767 5.855H.766l-.452.18a.5.5 0 0 0-.082.887l.41.26.001.002 4.995 3.178 3.178 4.995.002.002.26.41a.5.5 0 0 0 .886-.083l6-15Zm-1.833 1.89L6.637 10.07l-.215-.338a.5.5 0 0 0-.154-.154l-.338-.215 7.494-7.494 1.178-.471-.47 1.178Z"/>
</svg>Envoyer</button>
<button type="reset" class="btn btn-danger"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-x-square-fill" viewBox="0 0 16 16">
  <path d="M2 0a2 2 0 0 0-2 2v12a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V2a2 2 0 0 0-2-2H2zm3.354 4.646L8 7.293l2.646-2.647a.5.5 0 0 1 .708.708L8.707 8l2.647 2.646a.5.5 0 0 1-.708.708L8 8.707l-2.646 2.647a.5.5 0 0 1-.708-.708L7.293 8 4.646 5.354a.5.5 0 1 1 .708-.708z"/>
</svg>
Annuler</button>
</form>
</body>
</html>