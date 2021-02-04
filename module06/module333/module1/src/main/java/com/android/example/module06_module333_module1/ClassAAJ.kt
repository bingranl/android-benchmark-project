package com.android.example.module06_module333_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAJ {
	private 	val instance_var_1_0: com.android.example.module06_module333_module5.ClassAAE = com.android.example.module06_module333_module5.ClassAAE()
	private 	val instance_var_1_1: com.android.example.module06_module334_module2.ClassAAH = com.android.example.module06_module334_module2.ClassAAH()
	private 	val instance_var_1_2: com.android.example.module06_module334_module2.ClassAAE = com.android.example.module06_module334_module2.ClassAAE()

	fun method0(
		param0: com.android.example.module06_module109_module1.ClassAAF,
		param1: com.android.example.module06_module334_module2.ClassAAJ
	) {
		listOf("1", "2", "3").forEach {
			param0.method2("SomeString", "SomeString", "SomeString")

		}
	}

	fun method1(
		param0: com.android.example.module06_module109_module1.ClassAAB,
		param1: com.android.example.module06_module281_module1.ClassAAI
	) {
		listOf("1", "2", "3").forEach {
			param0.method2("SomeString", "SomeString", "SomeString")

			val local_var_3_0: com.android.example.module15_module10_module1.ClassAAH = com.android.example.module15_module10_module1.ClassAAH()
			local_var_3_0.method1(com.android.example.module15_module07_module1.ClassAAG(), com.android.example.module15_module07_module1.ClassAAJ())

		}
		val local_var_2_2: com.android.example.module06_module134_module7.ClassAAH = com.android.example.module06_module134_module7.ClassAAH()
		local_var_2_2.method2(com.android.example.module06_module296.ClassAAF())

	}

	fun method2(
		param0: com.android.example.module06_module333_module5.ClassAAJ
	) {
		param0.method0(io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber())

		param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.schedulers.SingleScheduler())

	}
}
