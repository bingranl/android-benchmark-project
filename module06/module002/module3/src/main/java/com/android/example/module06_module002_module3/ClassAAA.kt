package com.android.example.module06_module002_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module06_module002_module2.ClassAAB = com.android.example.module06_module002_module2.ClassAAB()
	private 	val instance_var_1_1: com.android.example.module06_module002_module5.ClassAAB = com.android.example.module06_module002_module5.ClassAAB()
	private 	val instance_var_1_2: com.android.example.module06_module002_module5.ClassAAH = com.android.example.module06_module002_module5.ClassAAH()

	fun method0(
		param0: com.android.example.module06_module002_module5.ClassAAB
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.request(191279808866204164)

		if (kotlin.Any().equals(kotlin.Any())) {
			listOf("1", "2", "3").forEach {
				param0.method0(dagger.internal.DelegateFactory(), dagger.internal.DelegateFactory(), dagger.internal.DelegateFactory())

				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.isCancelled()

			}
		}
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.isCancelled()

	}

	fun method1(
		param0: com.android.example.module06_module002_module5.ClassAAD,
		param1: com.android.example.module06_module002_module2.ClassAAH,
		param2: com.android.example.module06_module002_module5.ClassAAJ
	) {
		val local_var_2_3: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
		local_var_2_3.assertSubscribed()

		param0.method1(dagger.internal.DelegateFactory(), dagger.internal.DelegateFactory(), dagger.internal.DelegateFactory(), dagger.internal.DelegateFactory())

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.assertNotSubscribed()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.isCancelled()

	}

	fun method2(
		param0: com.android.example.module06_module002_module2.ClassAAD,
		param1: com.android.example.module06_module002_module2.ClassAAI,
		param2: com.android.example.module06_module002_module5.ClassAAD,
		param3: com.android.example.module06_module002_module5.ClassAAE
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.onError(kotlin.Throwable())

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.request(-6084429990570363968)

		val local_var_2_6: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_6.request(-5628797823113886323)

		val local_var_2_7: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_7.onError(kotlin.Throwable())

	}
}
