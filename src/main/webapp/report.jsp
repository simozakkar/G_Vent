<%@ taglib prefix="s" uri="/struts-tags" %>

<s:url var="pdf" action="report">
        <s:param name="idCmd" value="idCmd"/>
</s:url>
<div>
    <span class='text-success'>Payment has been successfully processed</span>
<s:a href="%{pdf}" target="_blank" >
    <button class="btn btn-primary btn-block" >Download Invoice</button>
</s:a>
</div>
