
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Language Detector</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://code.getmdl.io/1.1.3/material.indigo-pink.min.css">
    <script defer src="https://code.getmdl.io/1.1.3/material.min.js"></script>
    <style>
        html, * {
            font-family: monospace;
        }
        .header {
            font-family: monospace;
        }

        .page-content {
            margin: 20px;
            max-width:700px;
		}
	
		#text-area {
   		 border: groove;
		}
    </style>
    
    <link rel="icon" type="image/png" href="/static/main/logo_32.png" />
</head>

<body>
    <div class="mdl-layout mdl-js-layout mdl-layout--fixed-header">
        <header class="mdl-layout__header">
            <div class="mdl-layout__header-row">
                <!-- Title -->
                <span class="mdl-layout__tab is-active">Language Detector</span>
            </div>
        </header>
        <main class="mdl-layout__content">

            <section class="mdl-layout__tab-panel is-active" id="scroll-tab-1">
                <div class="page-content">
                    <div> Supported languages: C, C++, Java, JavaScript, Perl, Python, Ruby
                    <br /><br/>
                  
                    </div>
                    <form name="detectionform" method="post" action="LoadClassifier">
                        <textarea id="text-area" cols=80 rows=15 placeholder="Enter your code snippet here to classify the language" name="text-code"></textarea>
                        <br/>
                        <button class="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect" type="submit" name="clickButton">
                                Detect Language
                        </button>
                    </form>
                    <br/>
                   
                    </div>
               <div class="page-content" style="font-weight: bold;">Detected Language:  ${requestScope.languageDetected} </div>
            </section>
        </main>
    </div>
</body>
<html>