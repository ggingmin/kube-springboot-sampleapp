<!DOCTYPE html>
<html>
<head>
    <title>Waiting List App</title>
    <link rel="stylesheet" href="style.css">
</head>
<body class="ph3 pt0 pb4 mw7 center sans-serif">
<h1 class="f2 mb0">Waiting List App</h1>
<form action="/guest" method="POST">
    <ol class="list pl0">
        <li class="mv3"><label class="f6 b db mb2" for="content">Please put your name, numbers of guests on the waiting list.</label>
            <textarea class="f4 db border-box hover-black w-100 measure ba b--black-20 pa2 br2 mb2" rows="5"
                      name="content"><#if content??>${content}</#if></textarea>
            <input class="f6 link dim br1 ba bw1 ph3 pv2 mb2 dib black bg-white pointer" type="submit" value="Submit"
                   name="submit">
        </li>
    </ol>
</form>
<ul class="list pl0"><p class="f6 b db mb2">Waiting List</p>
    <#if guests??>
        <#list guests as guest>
            <li class="mv3 bb bw2 b--light-yellow bg-washed-yellow ph4 pv2"><p class="measure"></p>
                <p>${guest}</p>
                <p></p>
            </li>
        <#else>
            <p class="lh-copy f6">No guest.</p>
        </#list>
    </#if>
</ul>
</body>
</html>