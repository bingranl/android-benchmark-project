package com.android.example.module06_module076_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: com.android.example.module06_module076_module5.ClassAAI = com.android.example.module06_module076_module5.ClassAAI()
	private 	val instance_var_1_1: com.android.example.module06_module076_module1.ClassAAB = com.android.example.module06_module076_module1.ClassAAB()

	fun method0(
		param0: com.android.example.module06_module076_module5.ClassAAF,
		param1: com.android.example.module06_module076_module5.ClassAAE,
		param2: com.android.example.module06_module076_module1.ClassAAH,
		param3: com.android.example.module06_module076_module1.ClassAAA
	) {
		for (iAb in 0..2) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.assertSubscribed()

		}
		for (iAc in 0..3) {
			param0.method1("SomeString", "SomeString", "SomeString", "SomeString")

		}
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.dispose()

		val local_var_2_5: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_5.isDisposed()

	}

	fun method1(
		param0: com.android.example.module06_module076_module1.ClassAAF,
		param1: com.android.example.module06_module076_module1.ClassAAH
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.request(-3214299686355725865)

	}

	fun method2(
		param0: com.android.example.module06_module076_module5.ClassAAC,
		param1: com.android.example.module06_module076_module1.ClassAAG
	) {
		val local_var_2_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_2.isDisposed()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.dispose()

		param0.method2("SomeString")

	}
}
