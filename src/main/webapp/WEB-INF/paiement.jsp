<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Paiement</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>

</head>
<body>

<h1>paiement</h1>
<div class="mb-3">
  <label for="formGroupExampleInput" class="form-label"> Montant</label>
  <input type="number" class="form-control" id="formGroupExampleInput" name="montant"  >
</div>
<div class="mb-3">
  <label for="formGroupExampleInput" class="form-label"> Date d'achat</label>
  <input type="text" class="form-control" id="formGroupExampleInput" name="date"  >
</div>
<h3>Mode de paiement</h3>
<form method="post">
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1">
  <label class="form-check-label" for="inlineRadio1">Paypal</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2">
  <label class="form-check-label" for="inlineRadio2">Carte bleue</label>
</div>

<h5>Paypal</h5>
<div class="mb-3">
  <label for="formGroupExampleInput" class="form-label"> Numero de compte</label>
  <input type="text" class="form-control" id="formGroupExampleInput" name="numeroCompte"  >
</div>

<h5>CB</h5>
<div class="mb-3">
  <label for="formGroupExampleInput" class="form-label"> Numero de carte</label>
  <input type="text" class="form-control" id="formGroupExampleInput" name="numeroCarte"  >
</div>

<div class="mb-3">
  <label for="formGroupExampleInput" class="form-label"> Date d'expiration</label>
  <input type="text" class="form-control" id="formGroupExampleInput" name="dateExpiration" placeholder="AAAA-MM-dd" >
</div>

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