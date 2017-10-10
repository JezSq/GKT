<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="Grails"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>

    <asset:stylesheet src="application.css"/>

    <g:layoutHead/>
</head>

<body>

<div class="navbar navbar-default navbar-static-top" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/">
                GKT
            </a>
        </div>

        <div class="navbar-collapse collapse" aria-expanded="false" style="height: 0.8px;">
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                       aria-haspopup="true">Kategorijos</a>
                    <ul class="dropdown-menu">
                        <li><g:link controller="category" action="index">Rodyti visus</g:link></li>
                        <li><g:link controller="category" action="create">Sukurti naują</g:link></li>
                    </ul>
                </li>

                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                       aria-haspopup="true">Prekės</a>
                    <ul class="dropdown-menu">
                        <li><g:link controller="product" action="index">Rodyti visus</g:link></li>
                        <li><g:link controller="product" action="create">Sukurti naują</g:link></li>
                        <li><g:link class="" controller="product" action="csv">Eksportuoti CSV</g:link></li>
                    </ul>
                </li>

                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                       aria-haspopup="true">Gamintojai</a>
                    <ul class="dropdown-menu">
                        <li><g:link controller="manufacturer" action="index">Rodyti visus</g:link></li>
                        <li><g:link controller="manufacturer" action="create">Sukurti naują</g:link></li>
                    </ul>
                </li>

                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                       aria-haspopup="true">Tiekėjai</a>
                    <ul class="dropdown-menu">
                        <li><g:link controller="supplier" action="index">Rodyti visus</g:link></li>
                        <li><g:link controller="supplier" action="create">Sukurti naują</g:link></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                       aria-haspopup="true">Klientai</a>
                    <ul class="dropdown-menu">
                        <li><g:link controller="customer" action="index">Rodyti visus</g:link></li>
                        <li><g:link controller="customer" action="create">Sukurti naują</g:link></li>
                    </ul>
                </li>

                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                       aria-haspopup="true">Pardavimai</a>
                    <ul class="dropdown-menu">
                        <li><g:link controller="productSell" action="index">Rodyti visus</g:link></li>
                        <li><g:link controller="productSell" action="create">Parduoti</g:link></li>
                    </ul>
                </li>

                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                       aria-haspopup="true">Pirkimai</a>
                    <ul class="dropdown-menu">
                        <li><g:link controller="productReplenish" action="index">Rodyti visus</g:link></li>
                        <li><g:link controller="productReplenish" action="create">Pirkti</g:link></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</div>


    <g:layoutBody/>

<div class="footer" role="contentinfo"></div>

<div id="spinner" class="spinner" style="display:none;">
    <g:message code="spinner.alt" default="Loading&hellip;"/>
</div>

<asset:javascript src="application.js"/>

</body>
</html>
