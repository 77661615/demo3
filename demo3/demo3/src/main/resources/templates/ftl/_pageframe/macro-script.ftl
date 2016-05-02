<#macro script>

		<!-- basic scripts -->

		<!--[if !IE]> -->
		<script src="/assets/ace/js/jquery.js"></script>
		<!-- <![endif]-->
		<!--[if IE]>
		<script src="/assets/ace/js/jquery1x.js"></script>
		<![endif]-->
		<script type="text/javascript">
		/* 如果是移动设备，添加jquery mobile 支持 */
		if('ontouchstart' in document.documentElement) 
			document.write("<script src='/assets/ace/js/jquery.mobile.custom.js'>"+"<"+"/script>");
		</script>
		<script src="/assets/ace/js/bootstrap.js"></script>
		<!-- ace scripts -->
		<script src="/assets/ace/js/ace.js"></script>
		<script src="/assets/ace/js/ace-elements.js"></script>
		<!-- 已在html head中添加 
		<script src="/assets/ace/js/ace-extra.js"></script>
		-->

		<!-- page specific plugin scripts -->
		<#nested/>


</#macro>