using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Net;
using System.Runtime.Serialization;
using System.IO;

namespace BMI_Calculator
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        SOAPService.Service1Client soap_proxy = new SOAPService.Service1Client();
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void soap_btn_Click(object sender, EventArgs e)
        {
            try
            {
                string height = height_tf.Text;
                string weight = weight_tf.Text;

                int height_int = Convert.ToInt32(height);
                int weight_int = Convert.ToInt32(weight);

                double bmi = soap_proxy.BMI(height_int, weight_int);
                string healthIndicator = soap_proxy.healthIndicator(height_int, weight_int);
                soap_bmi_label.Text = bmi.ToString();
                soap_indicator_label.Text = healthIndicator;
            }
            catch (Exception ex) {
                ScriptManager.RegisterClientScriptBlock(this, this.GetType(), "alertMessage", "alert('Invalid input')", true);
            }
        }

        protected void rest_btn_Click(object sender, EventArgs e)
        {
            try
            {
                int height = Int32.Parse(height_tf.Text);
                int weight = Int32.Parse(weight_tf.Text);

                string[] info_array = { height.ToString(), weight.ToString() };

                //Connect to RESTful API
                Uri baseUri = new Uri("http://localhost:60522/Service.svc");
                UriTemplate get_bmi = new UriTemplate("/bmi?height={height}&weight={weight}");
                UriTemplate get_healthIndicator = new UriTemplate("/healthIndicator?height={height}&weight={weight}");

                //generate complete Uri with input data
                Uri completeSecretUri = get_bmi.BindByPosition(baseUri, info_array);
                Uri completeSecretUri2 = get_healthIndicator.BindByPosition(baseUri, info_array);


                //BMI RESTful API call
                WebClient channel = new WebClient();
                byte[] bytes = channel.DownloadData(completeSecretUri);
                Stream stream = new MemoryStream(bytes);
                DataContractSerializer obj = new DataContractSerializer(typeof(double));
                string bmi = obj.ReadObject(stream).ToString();

                //healthIndicator RESTful API call
                WebClient channel2 = new WebClient();
                byte[] bytes2 = channel2.DownloadData(completeSecretUri2);
                Stream stream2 = new MemoryStream(bytes2);
                DataContractSerializer obj2 = new DataContractSerializer(typeof(string));
                string healthIndicator = obj2.ReadObject(stream2).ToString();

                rest_bmi_label.Text = bmi;
                rest_indicator_label.Text = healthIndicator;
            }
            catch (Exception ex) {
                ScriptManager.RegisterClientScriptBlock(this, this.GetType(), "alertMessage", "alert('Invalid input')", true);
            }
        }
    }
}