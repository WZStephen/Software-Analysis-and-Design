<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="BMI_Calculator.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <asp:Label ID="Label1" runat="server" Font-Bold="True" Font-Size="X-Large" ForeColor="#0000CC" Text="Unit 6 SOC Project"></asp:Label>
        </div>
        <br />
        <br />
        <br />
        <br />
        <br />
        <br />
        <asp:Label ID="Label2" runat="server" Text="Height:"></asp:Label>
&nbsp;<asp:TextBox ID="height_tf" runat="server"></asp:TextBox>
        <br />
        <br />
        <br />
        <br />
        <asp:Label ID="Label3" runat="server" Text="Weight:"></asp:Label>
&nbsp;<asp:TextBox ID="weight_tf" runat="server"></asp:TextBox>
        <br />
        <br />
        <br />
        <br />
        <br />
        <br />
        <br />
        <asp:Label ID="Label4" runat="server" Text="SOAP Service Call"></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:Label ID="Label6" runat="server" Text="BMI:"></asp:Label>
&nbsp;<asp:Label ID="soap_bmi_label" runat="server"></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:Label ID="Label8" runat="server" Text="Health Indicator:"></asp:Label>
&nbsp;<asp:Label ID="soap_indicator_label" runat="server" Text="Label"></asp:Label>
        <br />
        <br />
        <asp:Button ID="soap_btn" runat="server" OnClick="soap_btn_Click" Text="Call SOAP API" />
        <br />
        <br />
        <br />
        <br />
        <asp:Label ID="Label5" runat="server" Text="REST Service API"></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:Label ID="Label7" runat="server" Text="BMI:"></asp:Label>
&nbsp;<asp:Label ID="rest_bmi_label" runat="server"></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:Label ID="Label9" runat="server" Text="Health Indicator:"></asp:Label>
&nbsp;<asp:Label ID="rest_indicator_label" runat="server" Text="Label"></asp:Label>
        <br />
        <br />
        <asp:Button ID="rest_btn" runat="server" OnClick="rest_btn_Click" Text="Call REST API" style="height: 26px; margin-bottom: 0px" />
    </form>
</body>
</html>
