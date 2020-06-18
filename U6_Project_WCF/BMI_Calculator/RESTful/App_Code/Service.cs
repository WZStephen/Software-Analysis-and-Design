using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;

// NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "Service" in code, svc and config file together.
public class Service : IService
{
    public string healthIndicator(int height, int weight)
    {
        double bmi = 703 * (weight / Math.Pow(height, 2));
        if (bmi < 18)
        {
            return "You are underweight";
        }
        else if (bmi < 25 && bmi >= 18)
        {
            return "Your weight is normal";
        }
        else if (bmi < 30 && bmi >= 25)
        {
            return "You are pre-obese";
        }
        else
        {
            return "You are obese";
        }
    }
    public double BMI(int height, int weight)
    {
        double bmi = 703 * (weight / Math.Pow(height, 2));
        return bmi;
    }

    public CompositeType GetDataUsingDataContract(CompositeType composite)
	{
		if (composite == null)
		{
			throw new ArgumentNullException("composite");
		}
		if (composite.BoolValue)
		{
			composite.StringValue += "Suffix";
		}
		return composite;
	}
}
