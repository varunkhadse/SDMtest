using System.ComponentModel.DataAnnotations;

namespace StudentManagement.Models
{
    public class Student
    {
        public int StudentNo { get; set; }

        [Required(ErrorMessage = "Name is required.")]
        public string Name { get; set; }

        [Required(ErrorMessage = "Section is required.")]
        public string Section { get; set; }

        [Required(ErrorMessage = "Branch is required.")]
        public string Branch { get; set; }

        [Required(ErrorMessage = "Email is required.")]
        [EmailAddress(ErrorMessage = "Invalid Email Address")]
        public string Email { get; set; }
    }
}
